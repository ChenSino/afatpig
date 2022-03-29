package com.chen.base.jvm;

/**
 * @author chenkun
 * @Description 测试把对象设置null内存回收
 * @date 2022/3/8 下午1:58
 */
public class Client2 {
    public static void main(String[] args) throws InterruptedException {
        String a = "aaa";
        String b = "bb";
        String c = a + b;
    }

}