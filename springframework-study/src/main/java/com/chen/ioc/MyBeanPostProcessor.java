package com.chen.ioc;

import com.chen.ioc.annotation.Custom;
import com.chen.ioc.bean.SonoBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


/**
 * @author chenkun
 * @Description
 * @date 2021/10/17 下午7:35
 */
@Slf4j
public class MyBeanPostProcessor implements BeanPostProcessor {
    public MyBeanPostProcessor() {
        log.warn("MyBeanPostProcessor init....");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.warn("[日志标志]:  postProcessBeforeInitialization");
        if (bean instanceof SonoBean) {
            Custom custom = bean.getClass().getAnnotation(Custom.class);
            SonoBean sonoBean = (SonoBean) bean;
            sonoBean.setName(custom.name());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
