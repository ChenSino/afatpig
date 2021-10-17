package com.chen.base.java8new;

/**
 * @author chenkun
 * @Description
 * @date 2021/10/17 下午7:38
 */
public interface IHello {
    default public void sayHi() {
        System.out.println("hello world.");
    }
}
