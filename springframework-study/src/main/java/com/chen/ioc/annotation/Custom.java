package com.chen.ioc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author chenkun
 * @Description 自定义注解
 * @date 2021/10/17 下午7:59
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Custom {
    String value() default "";

    int order() default 3;

    String name() default "";

    int age() default -1;
}
