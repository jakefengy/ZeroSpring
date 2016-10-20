package com.hello.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-19.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-spel.xml");

        Person person = (Person) ctx.getBean("person");

        System.out.println(person);


    }

}
