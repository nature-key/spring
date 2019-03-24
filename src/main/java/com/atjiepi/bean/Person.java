package com.atjiepi.bean;

import org.springframework.beans.factory.annotation.Value;

public class Person {


    @Value("王璇")
    public String name;
    @Value("#{20-9}")
    public String age;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Value("${person.nickname}")
    public String nickname;



    public Person() {
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
