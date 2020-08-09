package com.bowen.spring.entity;

import lombok.Data;

@Data
public class BeanDefinition {

    private String name;

    private String className;

    private volatile Class beanClass;

    private String initMethodName;

}