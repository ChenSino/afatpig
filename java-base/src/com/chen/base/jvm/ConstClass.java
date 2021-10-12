package com.chen.base.jvm;

/**
 * @author chenkun
 * @Description
 * @date 2021/10/12 上午10:16
 */
public class ConstClass {
    static {
        System.out.println("constClass init.......");
    }

    public static final String PLACEHOLDER = "XXXX";
}
