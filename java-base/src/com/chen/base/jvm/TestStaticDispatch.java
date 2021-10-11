package com.chen.base.jvm;

/**
 * @author chenkun
 * @Description 测试jvm静态分派
 * @date 2021/10/11 下午9:26
 */
public class TestStaticDispatch {
    static abstract class Human {
    }

    static class Man extends Human {
    }

    static class Woman extends Human {
    }

    public void sayHi(Human human) {
        System.out.println("human.....");
    }

    public void sayHi(Man man) {
        System.out.println("man.....");
    }

    public void sayHi(Woman woman) {
        System.out.println("women.....");
    }


    public static void main(String[] args) {
        TestStaticDispatch testStaticDispatch = new TestStaticDispatch();
        Human man = new Man();
        Human women = new Woman();
        // 两个输出的结果都是human,因为方法的参数类型在编译期间就已经确定，使用Human类型定义参数，即使真实类型是Man或者Woman,最终调用的还是sayHi(Human human)，如果注释掉sayHi(Human human)，
        //编译期间就直接报错
        testStaticDispatch.sayHi(man);
        testStaticDispatch.sayHi(women);
    }

}
