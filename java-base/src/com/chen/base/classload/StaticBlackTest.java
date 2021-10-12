package com.chen.base.classload;

/**
 * @author chenkun
 * @Description 测试静态代码块中的字段
 * @date 2021/10/12 上午10:41
 */
public class StaticBlackTest {
    //问题：为何静态代码块中在还没有定义之前都可以使用？
    //答：要理解类加载的原理，类加载过程：加载-验证-准备-解析-初始化，在准备阶段会先给静态变量分配空间（jdk8 hotspot是在方法区（实际也在堆）分配），并给一个初始值0,等到初始化
    //阶段，会按static上下顺序来初始化，初始化时实际a已经在准备阶段分配了内存，所以不会报错，但是在static代码快不能直接使用a,会报错“非法向前引用"。可以这么理解，其实初始化时有一瞬间a的
    //值被设置为3,然后又被后面的1给覆盖了
    static {
        a = 3;
//        System.out.println(a);
    }

    public static int a = 1;

    public static void main(String[] args) {
        System.out.println(a);
    }
}
