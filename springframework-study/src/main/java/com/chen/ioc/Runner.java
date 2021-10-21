package com.chen.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenkun
 * @Description 研究springIoc容器
 * @date 2021/10/15 下午1:56
 */
public class Runner {

    @Test
    public void protocal() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object sonoscape = applicationContext.getBean("banana");
    }
}
