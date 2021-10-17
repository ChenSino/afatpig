package com.chen.springcache.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chenkun
 * @Description
 * @date 2021/10/14 上午10:12
 */
@Data
public class User implements Serializable {
    private int age;
    private String name;
}
