package com.chen.mybatisplus.entity.enums;

import com.baomidou.mybatisplus.annotation.IEnum;

/**
 * @author afatpig
 * @date 2021/9/29 下午2:56
 */
public enum GradeEnum implements IEnum<Integer> {
    PRIMARY(1, "小学"), SECONDARY(2, "中学"), HIGH(3, "高中");

    /**
     * 年级code
     */
    private int code;
    /**
     * 描述
     */
    private String desc;

    GradeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return "GradeEnum{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
