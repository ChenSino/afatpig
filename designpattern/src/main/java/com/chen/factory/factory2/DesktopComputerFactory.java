package com.chen.factory.factory2;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/14 下午5:57
 */
public class DesktopComputerFactory implements ComputerFactory {
    @Override
    public Computer getComputer() {
        return new DesktopComputer();
    }
}
