package com.chen.springcache.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author chenkun
 * @Description 演示springboot的properties
 * @date 2021/11/5 上午11:34
 */
@ConfigurationProperties(prefix = "sono.bom")
@Component
@Data
public class BomProperties {

    private String address;

    private String uuid;
}
