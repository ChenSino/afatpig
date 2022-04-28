package com.chen.base.thread;

import java.util.concurrent.CompletableFuture;

/**
 * @author chenkun
 * @Description 异步线程，Future无法异步获取结果，调用get时会阻塞其主线程
 * @date 2022/4/6 上午11:38
 */
public class AsyncThread {
    public static void main(String[] args) throws InterruptedException {
        // 创建异步执行任务:
        CompletableFuture<Double> cf = CompletableFuture.supplyAsync(AsyncThread::fetchPrice);
        // 如果执行成功:
        cf.thenAccept((result) -> {
            System.out.println("price: " + result);
        });
        // 如果执行异常:
        cf.exceptionally((e) -> {
            e.printStackTrace();
            return null;
        });
        System.out.println("----------main--------");
        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
        Thread.sleep(10000);
    }

    static Double fetchPrice() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        if (Math.random() < 0.3) {
            throw new RuntimeException("fetch price failed!");
        }
        return 5 + Math.random() * 20;
    }
}

