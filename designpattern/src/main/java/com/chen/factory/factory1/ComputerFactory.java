package com.chen.factory.factory1;

/**
 * @author chenkun
 * @Description 简单工厂模式
 * @date 2021/11/14 下午5:45
 */
public class ComputerFactory {

    public static Computer getComputer(String computerType) {
        switch (computerType) {
            case "laptop":
                return new LaptopComputer();
            case "desktop":
                return new DesktopComputer();
            default:
                return null;
        }
    }
}
