package com.chen.factory.abstractfacoty;

import java.util.ArrayList;

/**
 * @author chenkun
 * @Description
 * @date 2021/11/25 下午4:56
 */
public class Client {
    public static void main(String[] args) {
        AbstractCourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().play();
        new ArrayList<>().stream().parallel().forEach(item -> {
            System.out.println();
        });
    }
}
