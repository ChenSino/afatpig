package com.chen;

import com.chen.entity.SysUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author afatpig
 * @date 2021/9/29 上午10:04
 */
@SpringBootApplication
@MapperScan("com.chen.mapper")
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(App.class, args);
        SysUser bean = applicationContext.getBean(SysUser.class);
        System.out.println(bean);
    }

}
