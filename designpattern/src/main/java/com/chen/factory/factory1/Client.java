package com.chen.factory.factory1;

/**
 * @author chenkun
 * @Description 测试主类
 * 简单工厂是用来获取同一类型对象，比如通过传递参数，然后用switch或者if else去判断，从而得到笔记本电脑或者台式机电脑，注意这里一般是同一类型
 * @date 2021/11/14 下午5:50
 */
public class Client {

    public static void main(String[] args) {
        String computerType = "laptop";
        Computer computer = ComputerFactory.getComputer(computerType);
        System.out.println(computer.getType());
    }
}
