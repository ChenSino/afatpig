package com.sonoscape.springbootenable;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootEnableApplication {

    public static void main(String[] args) throws ClassNotFoundException {
//        SpringApplication.run(SpringbootEnableApplication.class, args);
        Class<?> aClass = Class.forName("com.sonoscape.springbootenable.configuration.UserConfiguration",false,new MyClassLoader());
        System.out.println(aClass);
        Class<?> bb = Class.forName("com.sonoscape.springbootenable.configuration.UserConfiguration",true,ClassLoader.getSystemClassLoader());
        System.out.println(bb);

        System.out.println(aClass==bb);
    }

}
