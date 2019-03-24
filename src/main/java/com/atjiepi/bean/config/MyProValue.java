package com.atjiepi.bean.config;

import com.atjiepi.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource(value = {"classpath:/person.properties"})

public class MyProValue {
    @Bean
    public Person person() {
        return new Person();
    }
}
