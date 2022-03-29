package com.example.springbootsourcestudy.enable;

import com.example.springbootsourcestudy.annotation.MyAnnotation;
import com.example.springbootsourcestudy.selector.MySelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/17 上午11:46
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Import(UserConfiguration.class)
@Import({MySelector.class})
@MyAnnotation("abbbba;lkjgsalkgjlkdsjga")
public @interface EnableUserConfiguration {
}
