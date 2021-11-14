package com.chen.factory1;

/**
 * @author chenkun
 * @Description 移动电脑
 * @date 2021/11/14 下午5:48
 */
public class LaptopComputer implements Computer {
    @Override
    public String getType() {
        return "laptop";
    }
}
