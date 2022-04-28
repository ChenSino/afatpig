package com.chen.base.thread;

import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/29 下午5:48
 */
public class ExceptionClient {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 4, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1), new MyThreadFactory());
        for (int i = 0; i < 5; i++) {
            try {
                Future future = threadPoolExecutor.submit(() -> {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                });
//                future.get();
            } catch (Exception e) {
                System.out.println(e);
            }
        }



    }
}
