package com.chen.base.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author afatpig
 * @date 2021/9/29 上午10:53
 */
public class LogTimeInvocationHandler implements InvocationHandler {
    /**
     * 被代理的对象（源对象）
     */
    private Object source;

    public LogTimeInvocationHandler(Object source) {
        this.source = source;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        for (int i = 0; i < args.length; i++) {
            System.out.println("参数：" + args[i]);
        }
        System.out.println("我在原方法执行前打印。。。");
        Object result = method.invoke(source, args);
        System.out.println("我在原方法执行后打印。。。");
        return result;
    }
}
