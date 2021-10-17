package com.chen.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenkun
 * @Description 研究springIoc容器
 * @date 2021/10/15 下午1:56
 */
public class Runner {

    @Test
    public void protocal() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        classPathXmlApplicationContext.close();
    }
}
