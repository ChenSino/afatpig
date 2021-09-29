package com.chen.base.proxy;

/**
 * @author afatpig
 * @date 2021/9/29 上午10:51
 */
public class ExecutorImpl implements Executor {
    @Override
    public int add(int x, int y) {
        System.out.println("enter into add method.");
        return x + y;
    }
}
