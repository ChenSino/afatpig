package com.chen.base.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/28 下午4:34
 */
public class PoolClient {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<?> future1 = executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "正常线程");
        });

        Future<?> future2 = executorService.submit(() -> {
            int a = 3 / 0;
            System.out.println(Thread.currentThread().getName() + "异常线程");
        });

//        Runnable runnable = null;
//        Future<?> future3 = executorService.submit(runnable);

        Object o = future1.get();
        System.out.println(o);

        Object o1 = future2.get();
        System.out.println(o1);
    }
}
