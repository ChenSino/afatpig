package com.chen.base.thread;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/29 下午10:29
 */
public class ContextClassLoader {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());
    }
}
