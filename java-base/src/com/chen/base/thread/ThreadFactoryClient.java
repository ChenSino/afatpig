package com.chen.base.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/29 下午3:55
 */
public class ThreadFactoryClient {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 4, 100L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1), new MyThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName()+ "=============AAAAAAAAAAAAaa");
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadPoolExecutor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "===========BBBBBBBBBB");
            try {
                Thread.sleep(1010);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadPoolExecutor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "===========CCCCCCCC");
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + "=========DDDDD");
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + "=========EEEEEE");
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadPoolExecutor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + "=========ffff");
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
