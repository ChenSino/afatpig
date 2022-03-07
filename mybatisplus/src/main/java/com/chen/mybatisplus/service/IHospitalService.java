package com.chen.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.mybatisplus.entity.Hospital;

/**
 * @author chenkun
 * @Description
 * @date 2021/12/28 上午11:25
 */
public interface IHospitalService extends IService<Hospital> {
    Hospital findHospitalsById(Long hospitalId);

    boolean cascadeDelete(Long id);
}
