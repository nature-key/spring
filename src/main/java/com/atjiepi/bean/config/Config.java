package com.atjiepi.bean.config;

import com.atjiepi.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan(value="com.atjiepi",includeFilters={
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
//},useDefaultFilters = false)

@ComponentScans(value = {
        @ComponentScan(value="com.atjiepi",includeFilters={
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = { Service.class})
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFilterCustom.class})
        },useDefaultFilters = false)

})
//@ComponentScan(value = "com.atjiepi")
public class Config {
    @Bean
    public Person person(){
        return  new Person("22","dd");
    }
}
