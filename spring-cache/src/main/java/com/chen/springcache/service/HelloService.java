package com.chen.springcache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author chenkun
 * @Description
 * @date 2021/10/13 下午5:02
 */
@Service
public class HelloService {

    @Cacheable(cacheNames = "boom", keyGenerator = "myKeyGenerator")
    public String testCacheOOM(String i) {
        return "placeholder";
    }
}
