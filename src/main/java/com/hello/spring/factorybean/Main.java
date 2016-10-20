package com.hello.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-20.
 */
public class Main {

    public static void main(String... a) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-factorybean.xml");

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

    }

}
