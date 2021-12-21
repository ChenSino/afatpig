package com.chen.base.map;

/**
 * @author chenkun
 * @Description
 * @date 2021/12/21 上午11:07
 */
public class Client {
    public static void main(String[] args) {
        // 1.Java8以前普通匿名内部类写法
        InterfaceA interfaceA = new InterfaceA() {
            @Override
            public void sayHi(String name) {
                System.out.println("hello \t" + name);
            }
        };
        // 2. java8后lambda表达式 + 函数式接口的写法
        InterfaceA interfaceA1 = (name) -> System.out.println("hello \t" + name);
    }
}
