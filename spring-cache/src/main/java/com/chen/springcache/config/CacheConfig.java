package com.chen.springcache.config;

import com.chen.springcache.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenkun
 * @Description spring缓存配置
 * @date 2021/10/13 下午4:34
 */
@Configuration
@EnableCaching
@Slf4j
public class CacheConfig {

    @Value("${spring.self.name}")
    private String name;

    @Value("${spring.self.age}")
    private int age;

    @Bean
    public User getUser() {
        log.warn(name);
        log.warn("age,{}", age);
        return new User();
    }
}