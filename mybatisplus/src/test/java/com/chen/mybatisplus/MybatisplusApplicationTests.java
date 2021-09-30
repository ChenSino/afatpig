package com.chen.mybatisplus;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.chen.mybatisplus.entity.User;
import com.chen.mybatisplus.entity.enums.GradeEnum;
import com.chen.mybatisplus.mapper.UserMapper;
import com.chen.mybatisplus.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired
    private IUserService userService;

    @Test
    @DS("slave_1")
    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        userList.forEach(System.out::println);

        List<User> userList = userService.list();
        userList.forEach(System.out::println);
    }

    @Test
    @DS("slave_1")
    public void testInsert() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        userList.forEach(System.out::println);
        User user = new User();
        user.setAge(10);
        user.setEmail("aaa.@com");
        user.setGrade(GradeEnum.SECONDARY);
        user.setName("张三那");
        userService.save(user);
    }
}
