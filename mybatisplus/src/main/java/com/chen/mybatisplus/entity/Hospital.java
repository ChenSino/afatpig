package com.chen.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author chenkun
 * @Description
 * @date 2021/12/28 上午10:11
 */
@TableName("sys_hospital")
@Data
public class Hospital {
    /**
     * 主键ID
     */
    @TableId
    private Long id;
    /**
     * 医院唯一识别UUID
     */
    private String uuid;
    /**
     * 医院编号
     */
    private String encoded;
    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 医院状态
     */
    private Integer status;
    /**
     * /**
     * 医院备注
     */
    private String hospitalRemark;
    /**
     * 装机数量
     */
    private Long installQuantity;
    /**
     * 信息来源
     */
    private String infoSources;
    /**
     * 医院评级
     */
    private Integer rating;
    /**
     * 医院级别
     */
    private String hospitalRating;
    /**
     * 医院属性
     */
    private String hospitalNature;

    /**
     * 公私立属性
     */
    private Integer nature;
    /**
     * 医院床位
     */
    private Integer hospitalBedNum;
    /**
     * 日平均检查量
     */
    private Integer dailyInspectNum;
    /**
     * 开立机器在医院定位
     */
    private Integer inHospitalPosition;
    /**
     * 开立机器在医院使用方式
     */
    private Integer inHospitalUseWay;
    /**
     * 竞争对手情况
     */
    private String competitors;
    /**
     * KOL
     */
    private Integer kol;
    /**
     * 医院照片地址
     */
    private String hospitalPhoto;
    /**
     * 最后跟进日期
     */
    private LocalDateTime lastFollowDate;
    /**
     * 创建日期
     */
    private LocalDateTime createDate;
    /**
     * 修改日期
     */
    private LocalDateTime modifyDate;
    /**
     * 登记代理商
     */
    private Integer deptId;
    /**
     * 创建用户ID
     */
    private Integer createrId;
    /**
     * 租户ID
     */
    private Integer tenantId;
    /**
     * 医院类型
     */
    private String hospitalType;
    /**
     * vip客户级别
     */
    private String vipCustomerLevel;
    /**
     * 医院等级
     */
    private String hospitalLevel;
    /**
     * 开立标签
     */
    private String sonoTag;
    /**
     * vip级别
     */
    private Integer vipLevel;


    private Address address;
    /**
     * 医院下
     */
    private List<HospitalDept> hospitalDepts;
}
