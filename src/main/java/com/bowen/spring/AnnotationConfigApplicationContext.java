package com.bowen.spring;

import com.bowen.spring.entity.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: zhaobowen
 * @create: 2020-08-09 15:40
 * @description:
 **/
public class AnnotationConfigApplicationContext  {

    protected final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);


    public AnnotationConfigApplicationContext(Class<?> springConfigurationClass) {
    }

    public <T> T getBean(Class<T> requiredType)  {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);

        return this.getBeanFactory().getBean(requiredType);
    }
}
