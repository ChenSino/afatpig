package com.chen.base.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenkun
 * @Description
 * @date 2022/2/28 下午5:58
 */
public class GenericTest<T extends  String> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    // 如下两个方法不会报错
    public static <Integer> void funA(Integer t) {
        System.out.println(t.toString());
    }

    public static void main(String[] args) throws NoSuchFieldException {
        List list = new ArrayList<String>();
        list.add(new Object());
        list.add(3);
    }

}

