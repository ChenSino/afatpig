package com.example.springbootsourcestudy.configuration;

import com.example.springbootsourcestudy.annotation.MyAnnotation;
import com.example.springbootsourcestudy.condition.UserCondition;
import com.example.springbootsourcestudy.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/16 下午10:41
 */
@Configuration
public class MyConfiguration {

    @Bean
    @Conditional({UserCondition.class})
    @MyAnnotation("aaabbbccc")
    public User getUser() {
        return new User();
    }
}
