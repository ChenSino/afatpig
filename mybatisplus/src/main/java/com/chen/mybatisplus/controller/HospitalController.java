package com.chen.mybatisplus.controller;

import com.chen.mybatisplus.entity.Hospital;
import com.chen.mybatisplus.service.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author afatpig
 * @date 2021/9/30 上午11:12
 */
@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    private IHospitalService hospitalService;

    @GetMapping("/{id}")
    public Hospital findById(@PathVariable Long id){
        return hospitalService.findHospitalsById(id);
    }

    @PostMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        hospitalService.cascadeDelete(id);
    }

}
