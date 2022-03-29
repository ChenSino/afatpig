package com.example.springbootsourcestudy.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author chenkun
 * @Description
 * @date 2022/3/16 下午10:42
 */
public class UserCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        metadata.getAnnotations().stream().forEach(item-> System.out.println(item.getClass()));
//        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(MyAnnotation.class.getName());
//        if (Objects.nonNull(annotationAttributes)) {
//            Set<Map.Entry<String, Object>> entries = annotationAttributes.entrySet();
//            entries.forEach(entry -> {
//                System.out.println(entry.getKey());
//                System.out.println(entry.getValue());
//            });
//        }
        return true;
    }
}
