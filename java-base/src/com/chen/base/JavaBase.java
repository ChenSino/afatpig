package com.chen.base;

import com.chen.base.proxy.Executor;
import org.junit.Test;

import java.util.LinkedList;

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

    @Test
    public void testClass() {
        Class[] classes = new Class[]{Executor.class};
        System.out.println(classes[0].getName());
    }

    @Test
    public void testInteger() {
        Integer a = 1111111111;
        Integer b = 1111111111;
        System.out.println(a == b);
    }
}

