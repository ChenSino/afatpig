package com.sonoscape.springbootenable.configuration;

import com.alibaba.fastjson.JSONObject;
import com.sonoscape.springbootenable.entity.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/17 上午10:33
 */
@Configuration
@ConditionalOnClass(JSONObject.class)
public class UserConfiguration {

    @Bean
    public User getUserEnable(){
        return new User();
    }
}
