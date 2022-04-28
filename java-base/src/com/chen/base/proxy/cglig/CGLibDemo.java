package com.chen.base.proxy.cglig;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/13 下午9:13
 */
public class CGLibDemo {

    static class Car {
        public void run() {
            System.out.println("the car is running");
        }
        public void run1() {
            System.out.println("the car is running11");
        }
    }

    static class CglibProxy<T> implements MethodInterceptor {

        private T target;// 代理对象

        public T getInstance(T target) {
            this.target = target;
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(this.target.getClass());
            enhancer.setCallback(this);
            return (T) (enhancer.create());
        }

        @Override
        public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            preOperation();
            Object retVal = methodProxy.invoke(this.target, args);
            postOperation();
            return retVal;
        }

        private void postOperation() {
            System.out.println("后置处理...");
        }

        private void preOperation() {
            System.out.println("前置处理...");
        }

    }

    public static void main(String[] args) {
        CglibProxy<Car> cglibProxy = new CglibProxy<>();
        Car car = cglibProxy.getInstance(new Car());
        car.run1();
    }

}
