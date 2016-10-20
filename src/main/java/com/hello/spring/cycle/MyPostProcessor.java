package com.hello.spring.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 2016-10-20.
 */
public class MyPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object o, String beanName) throws BeansException {

        System.out.println("postProcessBeforeInitialization..." + o + " , " + beanName);

        return o;
    }

    public Object postProcessAfterInitialization(Object o, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..." + o + " , " + beanName);
        if (beanName.equals("cycle")) {
            LifeCycle cycle = (LifeCycle) o;
            cycle.setName("Test life cycle");
        }
        return o;
    }
}
