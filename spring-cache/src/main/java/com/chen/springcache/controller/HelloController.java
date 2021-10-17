package com.chen.springcache.controller;

import com.chen.springcache.entity.User;
import com.chen.springcache.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenkun
 * @Description 测试spring缓存
 * @date 2021/10/13 下午4:33
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("hello")
    public String sayHello(@RequestParam("username") String username) {
        for (int i = 0; i < 10; i++) {
            helloService.testCacheOOM(i + "");
        }
        return "hello" + username;
    }

    @RequestMapping("hello1")
    @Cacheable(cacheNames = "too", keyGenerator = "myKeyGenerator")
    public String sayHello1(@RequestParam("username") String username) {
        return "hello" + username;
    }

    @RequestMapping("obj")
    @Cacheable(cacheNames = "obj", keyGenerator = "myKeyGenerator")
    public User obj(@RequestParam("name") String name) {
        User user = new User();
        user.setAge(33);
        user.setName(name);
        return user;
    }

    @RequestMapping("getObj")
    @Cacheable(cacheNames = "obj", keyGenerator = "myKeyGenerator")
    public User getObj(@RequestParam("name") String name) {
        System.out.println("========getobj===========");
        User user = new User();
        user.setAge(33);
        user.setName(name);
        return user;
    }

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("setUser")
    public User setUser(@RequestParam("name") String name) {
        System.out.println("========set user===========");
        User user = new User();
        user.setAge(44);
        user.setName(name);
        redisTemplate.opsForValue().set("user", user);
        return user;
    }


    @RequestMapping("getUser")
    public User getUser() {
        System.out.println("========get user===========");
        return (User) redisTemplate.opsForValue().get("user");
    }

}
