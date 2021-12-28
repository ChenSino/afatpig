package com.chen.factory.factory3;

/**
 * @author chenkun
 * @Description 自定义一个工厂，此工厂实现一个抽象工厂，作用是获取一组有一定关联关系的对象，比如本例中，获取一个组装电脑，电脑鼠标选择Usb鼠标，主机选择桌面电脑
 * @date 2021/11/14 下午7:58
 */
public class CustomPCFactory implements AbstractPCFactory {
    @Override
    public Mouse getMouse() {
        return new UsbMouse();
    }

    @Override
    public Computer getComputer() {
        return new DesktopComputer();
    }
}
