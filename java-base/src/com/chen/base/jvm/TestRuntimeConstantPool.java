package com.chen.base.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenkun
 * @Description 测试运行时常量池
 * @date 2021/10/19 下午3:17
 */
public class TestRuntimeConstantPool {
    //-XX:MetaspaceSize=50m -XX:MaxMetaspaceSize=50m -Xms20m -Xmx20m
    //测试结果Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
    //	at com.chen.base.jvm.TestRuntimeConstantPool.main(TestRuntimeConstantPool.java:15)
    //结论：运行时常量池是在方法区，方法区在jdk8中只是一种逻辑上的叫法，其实际就是堆中的一部分内存。运行时常量池中存储的是编译期生
    //成的各种字面量与符号引用，注意MetaSpace和它的区别，MetaSpace存放的是class字节码文件，运行时常量池存放的内容是读取class文件中的内容。
    //普通字符串存放的位置在方法区的运行时常量池，所以下面代码报oom异常而不是MetaSpace异常
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            list.add(("" + i).intern());
        }
    }
}
