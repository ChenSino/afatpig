package com.chen.factory3;

/**
 * @author chenkun
 * @Description usb鼠标
 * @date 2021/11/14 下午7:56
 */
public class UsbMouse implements Mouse {
    @Override
    public String getType() {
        return "usbmouse";
    }
}
