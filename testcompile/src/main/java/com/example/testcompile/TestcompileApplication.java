package com.example.testcompile;

import org.springframework.boot.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestcompileApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestcompileApplication.class, args);
    }

    @Bean
    @ConditionalOnClass(A.class)
    A getBeanA() {
        return new A();
    }
}
}
