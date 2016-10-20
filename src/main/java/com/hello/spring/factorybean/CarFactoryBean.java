package com.hello.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 2016-10-20.
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Car getObject() throws Exception {
        return new Car(name, 120);
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
