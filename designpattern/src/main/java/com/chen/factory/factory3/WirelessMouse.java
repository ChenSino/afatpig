package com.chen.factory.factory3;

/**
 * @author chenkun
 * @Description 无线鼠标
 * @date 2021/11/14 下午7:55
 */
public class WirelessMouse implements Mouse {
    @Override
    public String getType() {
        return "wireless";
    }
}
