package com.atjiepi.bean.ext;

import com.atjiepi.bean.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.atjiepi.bean.ext")
@Configuration
public class MyExtConfig {
    @Bean
    public Blue blue(){
         return  new Blue();
    }
}
