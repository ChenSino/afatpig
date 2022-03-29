package com.chen.base.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/29 下午3:31
 */
public class TestCaller {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        String s = executorService.submit(() -> "ok hello").get();
        System.out.println(s);
    }
}
