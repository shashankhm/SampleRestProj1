package com.sh.RestProj.internal;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

public class TestPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("Custom Post Processor Called");
        return null;
    }
}
