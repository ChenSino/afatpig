package com.chen.base.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/5 下午4:20
 */
public class Client {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        list.add("a");
//        list.add("b");
//
//        String peek = list.peek();
//        System.out.println(peek);

        Map<String, String> map = new HashMap<>(3);
        map.put("name", "zhangsan");
        map.put("xx", "zhangsan");
        map.put("namea", "zhangsan");
        map.put("x", "zhangsan");
        map.put("3", "zhangsan");
        map.put("33", "zhangsan");

    }
}
