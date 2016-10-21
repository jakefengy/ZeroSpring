package com.hello.spring.aop.impl;

import org.springframework.stereotype.Component;

/**
 * 2016-10-21.
 */
@Component
public class ArithmeticImpl implements Arithmetic {

    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    public int mul(int i, int j, int k) {
        int result = i * j * k;
        return result;
    }

    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
