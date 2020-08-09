package com.bowen.spring.annotation;

import java.lang.annotation.*;

/**
 * @author: zhaobowen
 * @create: 2020-08-08 12:00
 * @description:
 **/
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Bean {

    String[] value() default {};

    String[] name() default {};
}
