package com.chen.springcache.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author chenkun
 * @Description 测试spirngboot读取自定义配置
 * @date 2021/10/21 下午2:35
 */
@Data
@ConfigurationProperties(prefix = "spring.self")
public class MyConfigProperties {
    private String name;

    private int age;
}
