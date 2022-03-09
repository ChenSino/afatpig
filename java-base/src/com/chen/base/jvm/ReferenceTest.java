package com.chen.base.jvm;

import java.lang.ref.SoftReference;

/**
 * @author chenkun
 * @Description 对象引用类型实测
 * @date 2022/3/9 下午10:19
 */
public class ReferenceTest {
    // -Xms300m -Xmx300m -Xmn100m （老年代和年轻代默认为2：1,xmn指定新生代100m,所以老年代为200m）
    //1. 测试软引用，给堆内存足够大的内存，当gc时，堆内存足够，软引用的对象不会被回收
    public static void main(String[] args) throws InterruptedException {
        byte[] data = new byte[100 * 1024 * 1024];//100m数据算大对象，直接进老年代了，观察时注意看老年代
        SoftReference<byte[]> softReference = new SoftReference<>(data);
        data = null;
        System.out.println("第一次回收前" + softReference.get());
        System.gc();
        //等待垃圾回收
        Thread.sleep(300);
        System.out.println("第一次回收后--》" + softReference.get());


        System.out.println("-----------------------------------------");

        //再创建一个100m超大对象申请100m堆内存，会导致
        byte[] data1 = new byte[100 * 1024 * 1024];

        System.out.println("又创建一个大对象之后===》" + softReference.get()); //变成null,说明软引用对象被回收了
    }


//    public static void main(String[] args) throws InterruptedException {
//        byte[] data = new byte[10 * 1024 * 1024];
//        SoftReference<byte[]> softReference = new SoftReference<>(data);
//        data = null;
//        System.out.println("第一次回收前" + softReference.get());
//        System.gc();
//        //等待垃圾回收
//        Thread.sleep(300);
//        System.out.println("第一次回收后" + softReference.get());
//    }


    // -Xms300m -Xmx300m -Xmn100m
    //2. 测试弱引用，给堆内存足够大的内存，当gc时，即使堆内存足够，弱引用的对象也会被回收
//    public static void main(String[] args) throws InterruptedException {
//        byte[] data = new byte[10 * 1024 * 1024];
//        WeakReference<byte[]>  weakData = new WeakReference<>(data);
//        data = null;
//        System.out.println("第一次回收前" + weakData.get());
//        System.gc();
//        //等待垃圾回收
//        Thread.sleep(300);
//
//        System.out.println("第一次回收后" + weakData.get());
//    }
}
