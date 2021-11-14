package com.chen.factory2;

/**
 * @author chenkun
 * @Description 桌面电脑
 * @date 2021/11/14 下午5:56
 */
public class DesktopComputer implements Computer {
    @Override
    public String getType() {
        return "desktop";
    }
}
