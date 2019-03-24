package com.atjiepi.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog {
    public Dog() {

        System.out.println("dog...");
    }

    @PostConstruct
    public void init(){
        System.out.println("对象属性赋值进行初始化");
    }
    @PreDestroy
    public  void destoty(){
        System.out.println("容器已出前 销毁");
    }
}
