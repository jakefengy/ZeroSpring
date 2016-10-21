package com.hello.spring.aop.tradition;

/**
 * 2016-10-21.
 */
public class Main {

    public static void main(String... a) {

        Arithmetic arithmetic = null;

//        arithmetic = new ArithmeticImpl();

        arithmetic = new ArithmeticLoggerProxy(new ArithmeticAopImpl()).getArithmeticProxy();

        int result = arithmetic.add(1, 2);
        System.out.println("From Main: " + result);

        result = arithmetic.div(4, 2);
        System.out.println("From Main: " + result);

    }

}
