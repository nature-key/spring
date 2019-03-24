package com.atjiepi.bean.config;

import com.atjiepi.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@ComponentScan("com.atjiepi.bean")
@Configuration
public class Config3 {
    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Car car() {
        return new Car();
    }

}
