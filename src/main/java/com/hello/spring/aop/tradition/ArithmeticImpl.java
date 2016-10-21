package com.hello.spring.aop.tradition;

/**
 * 2016-10-21.
 */
public class ArithmeticImpl implements Arithmetic {

    public int add(int i, int j) {
        System.out.println("add start with " + i + " , " + j);
        int result = i + j;
        System.out.println("add ends with " + result);
        return result;
    }

    public int sub(int i, int j) {
        System.out.println("sub start with " + i + " , " + j);
        int result = i - j;
        System.out.println("sub ends with " + result);
        return result;
    }

    public int mul(int i, int j) {
        System.out.println("mul start with " + i + " , " + j);
        int result = i * j;
        System.out.println("mul ends with " + result);
        return result;
    }

    public int div(int i, int j) {
        System.out.println("div start with " + i + " , " + j);
        int result = i / j;
        System.out.println("div ends with " + result);
        return result;
    }
}
