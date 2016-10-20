package com.hello.spring.annotation.controller;

import com.hello.spring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 2016-10-20. 标记表现层组件
 */
@Controller
public class UserController {

    //    Autowired：
    //    1、加在参数声明的位置
    //    2、加在参数setter方法上   两种都可以实现对参数的实例化

//    @Autowired
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void execute() {
        System.out.println("UserController execute...");

        userService.add();

    }

}
