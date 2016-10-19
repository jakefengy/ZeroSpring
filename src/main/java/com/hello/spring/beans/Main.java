package com.hello.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-18.
 */
public class Main {

    public static void main(String[] args) {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("Jone");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-application-config.xml");

//        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
//
//        helloWorld.hello();

//        Car car = (Car) ctx.getBean("car");
//        System.out.println(car.toString());
//
//        car = (Car) ctx.getBean("car2");
//        System.out.println(car.toString());

        Person person = (Person) ctx.getBean("personList");
        System.out.println(person.toString());

        person = (Person) ctx.getBean("personMap");
        System.out.println(person.toString());

    }

}
