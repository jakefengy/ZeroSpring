package com.hello.spring.aop.tradition;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 2016-10-21.
 */
public class ArithmeticLoggerProxy {

    private Arithmetic target;

    public ArithmeticLoggerProxy(Arithmetic target) {
        this.target = target;
    }

    public Arithmetic getArithmeticProxy() {

        Arithmetic proxy;

        ClassLoader loader = ArithmeticAopImpl.class.getClassLoader();
        Class[] interfaces = new Class[]{Arithmetic.class};

        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                String methodName = method.getName();

                System.out.println(methodName + " start with " + Arrays.toString(args));

                Object result = null;
                try {
                    // 前置通知 @Before
                    result = method.invoke(target, args);
                    // 返回通知 @AfterReturning
                } catch (Exception e) {
                    e.printStackTrace();
                    // 异常通知 @AfterThrowing
                }

                // 后置通知

                System.out.println(methodName + " ends with " + result);
                return result;
            }
        };

        proxy = (Arithmetic) Proxy.newProxyInstance(loader, interfaces, handler);

        return proxy;

    }

}
