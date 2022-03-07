package com.chen.base.thread;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/7 上午9:38
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        int a = 0;
        while (a++ < 10000) {
            Runnable runnable = () -> {
                try {
                    Thread.sleep(60*3 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            new Thread(runnable).start();
            Thread.sleep(1);
        }
    }
}
