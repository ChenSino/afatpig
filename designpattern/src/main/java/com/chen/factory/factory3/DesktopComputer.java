package com.chen.factory.factory3;

/**
 * @author chenkun
 * @Description 桌面电脑
 * @date 2021/11/14 下午7:53
 */
public class DesktopComputer implements Computer {
    @Override
    public String getType() {
        return "desktop";
    }
}
