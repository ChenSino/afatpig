package com.chen.factory.factory1;

/**
 * @author chenkun
 * @Description 桌面电脑
 * @date 2021/11/14 下午5:47
 */
public class DesktopComputer implements Computer {

    @Override
    public String getType() {
        return "desktop";
    }
}
