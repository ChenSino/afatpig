package com.chen;

import java.util.concurrent.ForkJoinPool;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/5 上午10:46
 */
public class Test {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        forkJoinPool.execute(new CustomRecursiveAction("abcdefghijklmnopqrst"));
    }
}
