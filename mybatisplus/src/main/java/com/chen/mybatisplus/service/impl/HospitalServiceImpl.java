package com.chen.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.mybatisplus.entity.Hospital;
import com.chen.mybatisplus.mapper.HospitalMapper;
import com.chen.mybatisplus.service.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public List<Hospital> findHospitalsById(Long hospitalId) {
        return hospitalMapper.findHospitalsById(hospitalId);
    }
}
