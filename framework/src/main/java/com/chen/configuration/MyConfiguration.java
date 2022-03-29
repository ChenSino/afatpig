package com.chen.configuration;

import com.chen.condition.UserCondition;
import com.chen.entity.SysUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenkun
 * @Description 自定义配置类
 * @date 2022/3/16 下午10:36
 */
@Configuration
@Conditional({UserCondition.class})
public class MyConfiguration {

    @Bean
    public SysUser getUser(){
        return new SysUser();
    }
}
