package com.chen.base.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chenkun
 * @Description 测试多线程
 * @date 2021/10/21 下午5:19
 */
public class Client {
    public static volatile AtomicInteger count = new AtomicInteger(100);

    public static void main(String[] args) {
        Runnable task = () -> {
            while (count.intValue() > 0) {
                int i = count.decrementAndGet();
                System.out.println(Thread.currentThread().getName() + ":" + i);
                System.out.println();
            }
        };

        Thread threadA = new Thread(task, "A");
        Thread threadB = new Thread(task, "B");
        Thread threadC = new Thread(task, "C");
        Thread threadD = new Thread(task, "D");

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
