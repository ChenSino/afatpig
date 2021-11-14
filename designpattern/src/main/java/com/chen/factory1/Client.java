package com.chen.factory1;

/**
 * @author chenkun
 * @Description 测试主类
 * @date 2021/11/14 下午5:50
 */
public class Client {
    public static void main(String[] args) {
        String computerType = "laptop";
        Computer computer = ComputerFactory.getComputer(computerType);
        System.out.println(computer.getType());
    }
}
