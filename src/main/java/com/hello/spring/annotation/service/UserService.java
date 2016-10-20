package com.hello.spring.annotation.service;

import com.hello.spring.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 2016-10-20. 标记服务层（业务层）组件
 */
@Service
public class UserService {

    //    Autowired
    //        如果IOC中，有相同类型的bean，比如有2个UserRepository的实现（UserRepositoryImpl和UserJdbcRepository），分辨方式：
    //    1、判断变量名是否与IOC中实例的bean的名字相同，如（userRepository == UserRepositoryImpl的名字）
    //    2、通过Qualifier标签指定，与该变量相对应的实现，如（@Qualifier("userJdbcRepository")，表示该接口的实现为UserJdbcRepository）

//    @Autowired
//    @Qualifier("userJdbcRepository")
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(@Qualifier("userJdbcRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add() {
        System.out.println("UserService add...");

        userRepository.save();

    }

}
