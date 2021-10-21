package com.chen.springcache;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ConfigurationPropertiesScan(basePackages = {"com.chen.springcache.properties"})
public class SpringCacheApplication {

    @Value("${spring.self.name}")
    public static String name;

    public static void main(String[] args) {
        SpringApplication.run(SpringCacheApplication.class, args);
    }

}
