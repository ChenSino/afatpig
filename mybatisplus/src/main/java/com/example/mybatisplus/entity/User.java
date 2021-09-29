package com.example.mybatisplus.entity;

import lombok.Data;

/**
 * @author afatpig
 * @date 2021/9/29 上午10:14
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}