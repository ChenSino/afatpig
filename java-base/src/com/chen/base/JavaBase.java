package com.chen.base;

import org.junit.Test;

import java.util.*;

/**
 * @author afatpig
 * @date 2021/9/21 上午10:19
 */
public class JavaBase {
    public void testString() {
        String myName = new String("chenkun");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<String> userLocal = new ThreadLocal<>();
        Runnable r = () -> {
            userLocal.set("I am user ...");
            System.out.println("run..........");
            System.out.println(Thread.currentThread().getName() + ":" + userLocal.get());
        };
        Thread t = new Thread(r);
        t.start();

        Thread.sleep(11);
        String s = userLocal.get();
        System.out.println(Thread.currentThread().getName() + ":" + s);
    }

    @Test
    public void hashSet() {
        LinkedList list = new LinkedList<>();
        list.push("aa");
        list.push("bb");
        list.push("cc");
        System.out.println("---");

        list.add("dd");
        list.push("ee");
        System.out.println(3);
    }
}
