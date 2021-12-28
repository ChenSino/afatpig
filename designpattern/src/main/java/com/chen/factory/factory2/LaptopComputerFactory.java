package com.chen.factory.factory2;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/14 下午5:58
 */
public class LaptopComputerFactory implements ComputerFactory {
    @Override
    public Computer getComputer() {
        return new LaptopComputer();
    }
}
