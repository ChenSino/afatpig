package com.chen.springcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author chenkun
 * @Description Redis
 * @date 2021/10/30 下午9:33
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @RequestMapping("setnx")
    public String setNx(@RequestParam("val") String val) {
        final Boolean result = redisTemplate.opsForValue().setIfAbsent("distributeLock", val, 10000, TimeUnit.MILLISECONDS);
        System.out.println(result);
        return "";
    }
}
