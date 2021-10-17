package com.chen.base.java8new;

/**
 * @author chenkun
 * @Description
 * @date 2021/10/17 下午7:38
 */
public class HelloImpl implements IHello {
    @Override
    public void sayHi() {
        IHello.super.sayHi();
    }
}

class Cilent {
    public static void main(String[] args) {
        HelloImpl hello = new HelloImpl();
        hello.sayHi();
    }
}