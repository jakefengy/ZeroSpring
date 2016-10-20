package com.hello.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-20.
 */
public class Main {

    public static void main(String... a) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-factory.xml");

        System.out.println("静态工厂方式...");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        System.out.println("实例工厂方式...");
        car = (Car) ctx.getBean("car2");
        System.out.println(car);

    }

}
