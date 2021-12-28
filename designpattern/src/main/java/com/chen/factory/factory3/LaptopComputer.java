package com.chen.factory.factory3;

/**
 * @author chenkun
 * @Description 移动电脑
 * @date 2021/11/14 下午7:54
 */
public class LaptopComputer implements Computer {
    @Override
    public String getType() {
        return "laptop";
    }
}
