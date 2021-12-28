package com.chen.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author chenkun
 * @Description
 * @date 2021/12/28 上午10:11
 */
@Data
@TableName("address")
public class Address {

    @TableId
    private Integer addressId;

    private String addressName;

    private Integer countryId;

    private Integer provinceId;

    private Integer cityId;

    private Integer countyId;

    private Integer streetId;

    private String detail;

    private Integer areaId;

    private Integer officeId;

}
