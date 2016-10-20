package com.hello.spring.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * 2016-10-20.
 */
@Repository
public class UserJdbcRepository implements UserRepository {

    public void save() {
        System.out.println("UserJdbcRepository  save...");
    }
}
