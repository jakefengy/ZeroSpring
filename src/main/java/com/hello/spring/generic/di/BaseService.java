package com.hello.spring.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 2016-10-21.
 */
public class BaseService<T> {

    @Autowired
    private BaseRepository<T> repository;

    public void add() {
        System.out.println("BaseService add...");
        System.out.println(repository);
    }

}
