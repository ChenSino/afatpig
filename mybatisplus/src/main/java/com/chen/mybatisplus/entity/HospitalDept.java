package com.chen.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author chenkun
 * @Description
 * @date 2021/12/28 上午10:11
 */
@TableName("sys_hospital_dept")
@Data
public class HospitalDept {
    private Long id;
    private String deptName;
    private String contactPerson;
    private String phoneNum;
    private String position;
    private String email;
    private Long hospitalId;
    private Integer doctorNum;



}
