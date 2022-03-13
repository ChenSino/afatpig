package com.chen.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author chenkun
 * @Description 研究springIoc容器
 * @date 2021/10/15 下午1:56
 */
public class Runner {

    @Test
    public void protocal() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object entityA = applicationContext.getBean("entityA");
//        Object entityB = applicationContext.getBean("entityB");
//        System.out.println(entityA);
//        System.out.println(entityB);
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Object entityA = beanFactory.getBean("entityA");
        System.out.println(entityA);

    }
}
