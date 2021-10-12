package com.chen.base.classload;

/**
 * @author chenkun
 * @Description 运行客户端
 * @date 2021/10/12 上午10:42
 */
public class Client {
    //问题：a是属于类变量还是实例变量？如何使用它？
    static {
        int a = 123;
    }

    public static void main(String[] args) {
        StaticBlackTest staticBlackTest = new StaticBlackTest();
    }
}
