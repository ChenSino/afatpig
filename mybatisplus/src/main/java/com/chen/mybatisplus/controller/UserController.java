package com.chen.mybatisplus.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.chen.mybatisplus.entity.User;
import com.chen.mybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author afatpig
 * @date 2021/9/30 上午11:12
 */
@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/slave-list")
    @DS("slave_1")
    public List<User> userListSlave() {
        return userService.list();
    }

    @GetMapping("/master-list")
    public List<User> userListMaster() {
        return userService.list();
    }
}
