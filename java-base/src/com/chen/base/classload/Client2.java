package com.chen.base.classload;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/7 下午10:29
 */
public class Client2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        MyClassLoader mcl = new MyClassLoader();
        Class<?> aClass = mcl.loadClass("com.chen.base.classload.Test3");
        Object obj = aClass.newInstance();
        System.out.println(obj);
        System.out.println(obj.getClass().getClassLoader());

        while (true){}
    }
}
