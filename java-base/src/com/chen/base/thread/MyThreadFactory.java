package com.chen.base.thread;

import java.util.concurrent.ThreadFactory;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/29 下午3:55
 */
public class MyThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(null, r, System.nanoTime() + "" );
        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("异常信息:"+ e.getMessage());
        });
        return thread;
    }
}
