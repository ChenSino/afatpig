package com.chen.base.jvm;

/**
 * @author chenkun
 * @Description 测试类加载时机。 jvm虚拟机规范没有规定类加载的时机，但是却有明确规定有几种情况类必须初始化，而类加载是在类初始化前，所以可以间接认为触发初始化
 * 的这几种情况会触发类加载。具体有那几种情况在下面测试，测试时，需要一种情况一种情况的测试，测试完后记得注释掉，保证只有你要测试的代码是打开的
 * @date 2021/10/12 上午9:30
 */
public class TestClassLoading {
    /**
     * -XX:+TraceClassLoading 打印类加载情况
     *
     * @param args
     */
    public static void main(String[] args) {
        //1. 遇到new、 getstatic、 putstatic或invokestatic这四条字节码指令时， 如果类型没有进行过初始化， 则需要先触发其初始化阶段。
        // 能够生成这四条指令的典型Java代码场景有：
        //1.1:使用new关键字实例化对象的时候。
        //1.2:读取或设置一个类型的静态字段（被final修饰、 已在编译期把结果放入常量池的静态字段除外）的时候。
        //1.3:调用一个类型的静态方法的时候。
//        LoadedObject loadedObject = new LoadedObject();
//        String placeholder = LoadedObject.placeholder;
//        LoadedObject.staticMethodTest();

        /*--------------------------------分割线------------------------------------*/

        //2.使用java.lang.reflect包的方法对类型进行反射调用的时候， 如果类型没有进行过初始化， 则需要先触发其初始化。
//        try {
//            Class<?> clazz = Class.forName("com.chen.base.jvm.LoadedObject");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        /*--------------------------------分割线------------------------------------*/
        //3.当初始化类的时候， 如果发现其父类还没有进行过初始化， 则需要先触发其父类的初始化,此种情况不单独测试，在以上测试都可以触发父类加载和初始化，结果如下：
        //[Loaded com.chen.base.jvm.LoadedObjectFather from file:/home/chenkun/IdeaProjects/afatpig/out/production/java-base/]
        //[Loaded com.chen.base.jvm.LoadedObject from file:/home/chenkun/IdeaProjects/afatpig/out/production/java-base/]

        /*--------------------------------分割线------------------------------------*/
        //4.当虚拟机启动时， 用户需要指定一个要执行的主类（ 包含main()方法的那个类） ， 虚拟机会先初始化这个主类。不单独测试，直接查看能看到输出里面有加载TestClassLoading
        //[Loaded com.chen.base.jvm.TestClassLoading from file:/home/chenkun/IdeaProjects/afatpig/out/production/java-base/]

        /*--------------------------------分割线------------------------------------*/
        //5.当使用JDK 7新加入的动态语言支持时， 如果一个java.lang.invoke.MethodHandle实例最后的解析结果为REF_getStatic、 REF_putStatic、 REF_invokeStatic、 REF_newInvokeSpecial四种类型的方法句
        //柄， 并且这个方法句柄对应的类没有进行过初始化， 则需要先触发其初始化。不懂……不会测试

        /*--------------------------------分割线------------------------------------*/
        //6.当一个接口中定义了JDK 8新加入的默认方法（ 被default关键字修饰的接口方法） 时， 如果有这个接口的实现类发生了初始化， 那该接口要在其之前被初始化。
        //直接用ArrayList测试，ArrayList实现了List接口，List中有JDK8新增的default方法，直接初始化ArrayList查看会不会初始化List皆可。可以看到确实会加载List
        //[Loaded java.util.List from /usr/lib/jvm/java-8-openjdk/jre/lib/rt.jar]
//        new ArrayList();

        /*--------------------------------分割线------------------------------------*/

        /*---------------三种被动引用测试，不会触发初始化的情况----------------*/
        //1. 直接用子类调用父类中的static字段，会发现不会触发子类的初始化，但是会加载子类，其实jvm虚拟机规范没有定义此种情况一定要加载子类，由各种虚拟机自由决定，Hotspot的实现是加载子类
        //[Loaded com.chen.base.jvm.SubClass from file:/home/chenkun/IdeaProjects/afatpig/out/production/java-base/]
        //[Loaded sun.net.spi.DefaultProxySelector$1 from /usr/lib/jvm/java-8-openjdk/jre/lib/rt.jar]
        //[Loaded sun.net.NetProperties from /usr/lib/jvm/java-8-openjdk/jre/lib/rt.jar]
        //[Loaded sun.net.NetProperties$1 from /usr/lib/jvm/java-8-openjdk/jre/lib/rt.jar]
        //SuperClass init...
        //ok

//        System.out.println(SubClass.value);

        /*--------------------------------分割线------------------------------------*/
        //2. 引用类型的数组,结果是触发了类加载，但是没有触发初始化
        //[Loaded com.chen.base.jvm.SuperClass from file:/home/chenkun/IdeaProjects/afatpig/out/production/java-base/]
//        SuperClass[] superClasses = new SuperClass[10];

        //3. 静态常量，在编译期间优化了，已经把字符串编译到class文件，不会触发类加载，更不会初始化。（可以打开class文件看到ConstClass.PLACEHOLDER的值是直接写入在class中了）
//        String placeholder = ConstClass.PLACEHOLDER;
    }
}
