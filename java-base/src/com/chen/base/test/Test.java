package com.chen.base.test;

import com.sun.istack.internal.NotNull;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/29 下午3:16
 */
public class Test {
    public static void main(String[] args) {
        String str = new Test().getStr();
        System.out.println(str);
    }


    @NotNull
    public String getStr(){
        return null;
    }
}
