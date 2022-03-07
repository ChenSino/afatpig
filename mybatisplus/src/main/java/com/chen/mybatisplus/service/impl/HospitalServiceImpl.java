package com.chen.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.mybatisplus.entity.Address;
import com.chen.mybatisplus.entity.Hospital;
import com.chen.mybatisplus.entity.HospitalDept;
import com.chen.mybatisplus.mapper.AddressMapper;
import com.chen.mybatisplus.mapper.HospitalDeptMapper;
import com.chen.mybatisplus.mapper.HospitalMapper;
import com.chen.mybatisplus.service.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author chenkun
 * @Description
 * @date 2021/12/28 上午11:25
 */
@Service
public class HospitalServiceImpl extends ServiceImpl<HospitalMapper, Hospital> implements IHospitalService {
    @Autowired
    private HospitalMapper hospitalMapper;
    @Autowired
    private AddressMapper addressMapper;
    @Autowired
    private HospitalDeptMapper hospitalDeptMapper;

    @Override
    public Hospital findHospitalsById(Long hospitalId) {
        return hospitalMapper.findHospitalById(hospitalId);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public boolean cascadeDelete(Long id) {
        //1. 根据id查询，得到关联地址id,部门id（列表）
        Hospital hospital = hospitalMapper.findHospitalById(id);
        System.out.println(hospital);
        // 2. 删除关联的地址
        Address address = hospital.getAddress();
        address.setDelFlag(true);
        addressMapper.updateById(address);
        List<HospitalDept> hospitalDepts = hospital.getHospitalDepts();
        if (!CollectionUtils.isEmpty(hospitalDepts)) {
            hospitalDepts.parallelStream().forEach(dept->dept.setDelFlag(true));
        }
        //3.删除关联的部门
        HospitalDept hospitalDept = new HospitalDept();
        hospitalDept.setDelFlag(true);
        QueryWrapper<HospitalDept> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("hospital_id", id);
        hospitalDeptMapper.update(hospitalDept, queryWrapper);
        //4. 删除医院
        hospital.setDelFlag(true);
        hospitalMapper.updateById(hospital);
        return true;
    }
}
