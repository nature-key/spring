package com.atjiepi.bean;

import org.springframework.stereotype.Component;

@Component
public class Car {

    public Car() {
        System.out.println("car.....");
    }

    public void init() {
        System.out.println("init...");
    }

    public void destory() {
        System.out.println("destory....");
    }
}
