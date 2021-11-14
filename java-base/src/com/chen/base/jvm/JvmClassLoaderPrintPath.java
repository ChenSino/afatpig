package com.chen.base.jvm;

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

/**
 * @author chenkun
 * @Description 查看哪些类被加载，排查类找不到哦啊
 * @date 2021/11/2 上午11:54
 */
public class JvmClassLoaderPrintPath {
    public static void main(String[] args) {

        // 启动类加载器
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        System.out.println("启动类加载器");
        for (URL url : urls) {
            System.out.println(" ==> " + url.toExternalForm());
        }

        // 扩展类加载器
        printClassLoader("扩展类加载器", JvmClassLoaderPrintPath.class.getClassLoader().getParent());

        // 应用类加载器
        printClassLoader("应用类加载器", JvmClassLoaderPrintPath.class.getClassLoader());

    }

    public static void printClassLoader(String name, ClassLoader CL) {
        if (CL != null) {
            System.out.println(name + " ClassLoader -> " + CL.toString());
            printURLForClassLoader(CL);
        } else {
            System.out.println(name + " ClassLoader -> null");
        }
    }

    public static void printURLForClassLoader(ClassLoader CL) {

        Object ucp = insightField(CL, "ucp");
        // ucp 是URLClassLoader 中的字段，URLClassPath类型，但是URLClassPath类型没有getPath方法，所以要再次通过反射获取path
        Object path = insightField(ucp, "path");
        ArrayList ps = (ArrayList) path;
        for (Object p : ps) {
            System.out.println(" ==> " + p.toString());
        }
    }

    /**
     * 通过反射获取对象字段值
     *
     * @param obj   目标对象
     * @param fName 字段名
     * @return 字段值
     */
    private static Object insightField(Object obj, String fName) {
        try {
            Field f = null;
            if (obj instanceof URLClassLoader) {
                f = URLClassLoader.class.getDeclaredField(fName);
            } else {
                f = obj.getClass().getDeclaredField(fName);
            }
            f.setAccessible(true);
            return f.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

