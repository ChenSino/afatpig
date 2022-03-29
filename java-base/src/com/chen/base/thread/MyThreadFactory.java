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
        Thread thread = new Thread(null, r, "xxxxxxx" + System.nanoTime());
//        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                throw new RuntimeException(e);
//            }
//        });
        return thread;
    }
}
