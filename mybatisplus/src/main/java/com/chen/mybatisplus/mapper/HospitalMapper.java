package com.chen.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.mybatisplus.entity.Hospital;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author chenkun
 * @Description
 * @date 2021/12/28 上午10:10
 */
@Mapper
public interface HospitalMapper extends BaseMapper<Hospital> {

    List<Hospital> findHospitalsById(Long hospitalId);
}
