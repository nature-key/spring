package com.atjiepi.bean.service;

import com.atjiepi.bean.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.inject.Inject;

@org.springframework.stereotype.Service
public class Service {
//    @Qualifier("personDao")
//    @Primary
    @Autowired
//    @Resource
//    @Inject
    private PersonDao personDao;

    public void print() {
        System.out.println(personDao);
    }

    @Override
    public String toString() {
        return "Service{" +
                "personDao=" + personDao +
                '}';
    }
}
