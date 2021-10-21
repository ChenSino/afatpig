package com.chen.ioc.bean;

import com.chen.ioc.annotation.Custom;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author chenkun
 * @Description 测试Bean
 * @date 2021/10/15 下午2:01
 */
@Custom(name = "zhangsan111", age = 22)
@Data
@Slf4j
public class SonoBean implements InitializingBean, BeanNameAware {

    private String name;

    private int age;

    public SonoBean() {
        log.warn("sono bean init..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.warn("enter into InitializingBean");
    }

    @Override
    public void setBeanName(String name) {
        log.info("调用BeanNameAware,当前正在实例化的bean是：{}", name);
    }
}
