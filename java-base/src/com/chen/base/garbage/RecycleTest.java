package com.chen.base.garbage;

/**
 * @author chenkun
 * @Description 测试垃圾回收
 * @date 2021/10/10 下午8:35
 */
public class RecycleTest {
    //-verbose:gc 在打印日志中发现，虽然调用哦垃圾回收，但实际上这64m堆内存没有被回收，因为栈帧中placeholder是一个GC root,其存放的是堆中的64m字节数组的首地址，虽然没有使用它，但是其在
    //局部变量表中一直有一个引用。若想调用gc后马上回收，则需要想办法去掉这个引用，重新定义一个本地变量，int a = 0,再次执行会发现被回收了，因为栈帧中做了优化，有的局部变量是可以复用，此处就是复用了placeholder
    //那个局部变量，失去了对堆中字节数组的引用后，也就说明这64m的对象不再GC root上，自然就可以被回收。  此处直接把placeholder设置null也可以，只要placeholder不引用这个对象即可。
    //设置null的这种方式不要随便用，因为虚拟机存在优化功能，很多时候手动设置null,会直接被虚拟机优化掉。
    //使用场景：方法中有一个超大对象，这个对象之后有一个非常耗时的操作，如果想用完这个大对象后就马上回收内存，而不是等这个耗时操作执行完再回收，可以尝试在用完大对象后给他设置null.
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
//        int a = 0;   //测试栈帧中局部变量槽复用 0
        System.gc();
    }
}
