package com.hello.spring.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * 2016-10-20. 标记持久层组件
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    public void save() {
        System.out.println("UserRepositoryImpl  save...");
    }
}
