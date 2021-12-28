package com.chen.factory.factory3;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/14 下午8:00
 */
public class Client {
    public static void main(String[] args) {
        //1. 获取一个桌面主机+USB鼠标
        AbstractPCFactory factory = new CustomPCFactory();
        System.out.println(factory.getComputer().getType());
        System.out.println(factory.getMouse().getType());

        //2. 获取移动主机+无线鼠标
        AbstractPCFactory factory1 = new AnotherCustomPCFactory();
        System.out.println(factory1.getComputer().getType());
        System.out.println(factory1.getMouse().getType());
    }
}
