package com.chen.factory.abstractfacoty;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/25 下午4:48
 */
public class PhpVideo implements IVideo {
    @Override
    public void play() {
        System.out.println("Play php video");
    }
}
