package com.example.springbootsourcestudy;

import com.example.springbootsourcestudy.enable.EnableUserConfiguration;
import com.sonoscape.springbootenable.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@Import(UserConfiguration.class)
//@ComponentScan("com.sonoscape")
@EnableUserConfiguration
public class SpringbootSourceStudyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootSourceStudyApplication.class, args);
        Object user = applicationContext.getBean(User.class);
        System.out.println(user);
    }

}
