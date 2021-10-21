package com.chen.ioc.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author chenkun
 * @Description
 * @date 2021/10/21 上午10:14
 */
@Slf4j
public class MyFactoryBean implements FactoryBean<BananaBean> {
    @Override
    public BananaBean getObject() throws Exception {
        log.warn("[日志]：invoke myfactory bean");
        return new BananaBean();
    }

    @Override
    public Class<BananaBean> getObjectType() {
        return null;
    }
}
