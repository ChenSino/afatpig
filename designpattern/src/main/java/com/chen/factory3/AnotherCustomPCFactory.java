package com.chen.factory3;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/14 下午8:02
 */
public class AnotherCustomPCFactory implements AbstractPCFactory {
    @Override
    public Mouse getMouse() {
        return new WirelessMouse();
    }

    @Override
    public Computer getComputer() {
        return new LaptopComputer();
    }
}
