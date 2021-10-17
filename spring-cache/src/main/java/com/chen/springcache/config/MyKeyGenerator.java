package com.chen.springcache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author chenkun
 * @Description
 * @date 2021/10/13 下午5:04
 */
@Component
public class MyKeyGenerator implements KeyGenerator {
    @Override
    public Object generate(Object target, Method method, Object... params) {
        return params[0].toString();
    }
}
