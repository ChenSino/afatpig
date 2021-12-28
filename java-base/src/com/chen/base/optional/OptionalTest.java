package com.chen.base.optional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenkun
 * @Description
 * @date 2021/12/21 下午4:09
 */
public class OptionalTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("agas");
        String s = list.stream().findFirst().orElse("xxx");
        System.out.println(s);
    }
}
