package com.example.springbootsourcestudy.selector;

import com.example.springbootsourcestudy.annotation.MyAnnotation;
import com.sonoscape.springbootenable.configuration.UserConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/17 下午2:04
 */
public class MySelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(MyAnnotation.class.getName());

        String[] result = {UserConfiguration.class.getName()};
        System.out.println(" UserConfiguration.class.getName():" +  UserConfiguration.class.getName());
        return result;
    }
}
