package com.atjiepi.bean.config;

import com.atjiepi.bean.Boss;
import com.atjiepi.bean.Car;
import com.atjiepi.bean.dao.PersonDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(value = {"com.atjiepi.bean"})
public class MyAutoConfig {
//    @Primary
    @Bean("personDao")
    public PersonDao personDao() {
        PersonDao personDao = new PersonDao();
        personDao.setLable("2");
        return personDao;
    }
    @Bean
    public Boss boss(Car car){
        Boss boss = new Boss();
        boss.setCar(car);
        return boss ;
    }
}
