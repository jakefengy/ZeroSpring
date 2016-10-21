package com.hello.spring.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-21.
 */
public class Main {

    public static void main(String... a) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-generic-di.xml");

        UserService service = (UserService) ctx.getBean("userService");
        service.add();

    }

}
