package com.atjiepi.bean.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Repository
public class TxUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public  void insert(){
        String sql ="insert into user(name,age) values(?,?)";
        String name = UUID.randomUUID().toString();
        jdbcTemplate.update(sql,name,12);
        System.out.println("insert ....");
        int i= 10/0;
    }
}
