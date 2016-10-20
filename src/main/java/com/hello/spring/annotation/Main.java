package com.hello.spring.annotation;

import com.hello.spring.annotation.controller.UserController;
import com.hello.spring.annotation.entity.User;
import com.hello.spring.annotation.repository.UserRepositoryImpl;
import com.hello.spring.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2016-10-20.
 */
public class Main {

    public static void main(String... a) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans-annotation.xml");

//        User user = (User) ctx.getBean("user");
//        System.out.println(user);
//
//        UserService service = (UserService) ctx.getBean("userService");
//        System.out.println(service);
//
//        UserRepositoryImpl repository = (UserRepositoryImpl) ctx.getBean("userRepository");
//        System.out.println(repository);

        UserController controller = (UserController) ctx.getBean("userController");
        controller.execute();

    }

}
