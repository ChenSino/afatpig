package com.chen.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.mybatisplus.entity.Hospital;

import java.util.List;

/**
 * @author chenkun
 * @Description
 * @date 2021/12/28 上午11:25
 */
public interface IHospitalService extends IService<Hospital> {
    List<Hospital> findHospitalsById(Long hospitalId);
}
