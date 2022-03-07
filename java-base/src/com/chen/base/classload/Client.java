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


        public static void main(String[] args) throws ClassNotFoundException {
            ClassLoader loader = Client.class.getClassLoader();
            System.out.println(loader);
            //使用ClassLoader.loadClass()来加载类，不会执行初始化块
//            loader.loadClass("com.chen.base.classload.Test2");
            //使用Class.forName()来加载类，默认会执行初始化块
//                Class.forName("com.chen.base.classload.Test2");
            //使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块
                Class.forName("com.chen.base.classload.Test2", false, loader);
        }
    }

