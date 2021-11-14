package com.chen.base.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenkun
 * @Description 测试堆溢出，转储溢出文件
 * @date 2021/11/2 下午3:02
 */
public class HeapOutOfMemory {
    /**
     * -XX:+PrintGCDetails  打印垃圾回收明细
     * -XX:+PrintGCDateStamps  打印时间戳
     * -Xloggc:gc.demo.log   打印日志到指定文件
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        //Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
        //JVM 抛出“java.lang.OutOfMemoryError: GC overhead limit exceeded”错误就是发出了这样的信号：执行垃圾收集的时间比例太大，
        // 有效的运算量太小。默认情况下，如果 GC 花费的时间超过 98%，并且 GC 回收的内存少于 2%，JVM 就会抛出这个错误。就是说，系统没法好好干活了，
        // 几乎所有资源都用来去做 GC，但是 GC 也没啥效果。此时系统就像是到了癌症晚期，身体的营养都被癌细胞占据了，真正用于身体使用的非常少了，而且
        // 就算是调用所有营养去杀灭癌细胞也晚了，因为杀的效果很差了，还远远没有癌细胞复制的速度快。

        //debug模式下就不会抛出GC overhead limit exceeded，因为断点后系统有足够时间去回收垃圾
        List<String> list = new ArrayList<>();
        int i = 1;
        while (true) {
            i++;
            list.add(String.valueOf(i).intern());
        }
        //直接跑出Java heap space是对象过大，当前内存无法满足；
//        final byte[] bytes = new byte[8 * 1024 * 1024];
    }
}
