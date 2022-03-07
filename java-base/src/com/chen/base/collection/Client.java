package com.chen.base.collection;

import java.util.LinkedList;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/5 下午4:20
 */
public class Client {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");

        String peek = list.peek();
        System.out.println(peek);

    }
}
