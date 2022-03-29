package com.chen.controller;

import com.chen.entity.Order;
import com.chen.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenkun
 * @Description
 * @date 2021/10/12 下午4:26
 */
@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired
    private IOrderService orderService;

/*    @RequestMapping("login")
    public String login() {
        return "ok";
    }*/

    @RequestMapping("userinfo")
    public String getUserInfo() {
        System.out.println("执行目标方法。。。。");
        return "user...";
    }


    @RequestMapping("/get")
    public List<Order> getOrder() {
        return orderService.findOrderList();
    }
}
