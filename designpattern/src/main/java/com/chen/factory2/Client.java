package com.chen.factory2;

/**
 * @author chenkun
 * @Description 主类
 * @date 2021/11/14 下午5:59
 */
public class Client {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new LaptopComputerFactory();
        Computer computer = computerFactory.getComputer();
        System.out.println(computer.getType());
    }
}
