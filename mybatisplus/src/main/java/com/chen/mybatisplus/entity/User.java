package com.chen.mybatisplus.entity;

import com.chen.mybatisplus.entity.enums.GradeEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * @author afatpig
 * @date 2021/9/29 上午10:14
 */
@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private GradeEnum grade;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", grade=" + grade.getDesc() +
                '}';
    }
}