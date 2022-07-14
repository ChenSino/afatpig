package com.example.springbootsourcestudy;

import com.example.springbootsourcestudy.enable.EnableUserConfiguration;
import com.sonoscape.springbootenable.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
//@Import(UserConfiguration.class)
//@ComponentScan("com.sonoscape")
@EnableUserConfiguration
@RestController
@RequestMapping("/hello")
public class SpringbootSourceStudyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootSourceStudyApplication.class, args);
        Object user = applicationContext.getBean(User.class);
        System.out.println(user);
    }


    @GetMapping("test50x")
    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR,reason = "服务器内部错误")
    public String test50x(HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin", "http://localhost:8080");
        if (true) {
            throw new RuntimeException("测试异常。。");
        }
        return "failed....";
    }

    @GetMapping("test20x")
    @ResponseStatus(value= HttpStatus.OK,reason = "ok")
    public String test20x(){
        return "ok....";
    }
}
