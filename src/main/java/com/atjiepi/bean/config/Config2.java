package com.atjiepi.bean.config;

import com.atjiepi.bean.Color;
import com.atjiepi.bean.Person;
import com.atjiepi.bean.Red;
import com.atjiepi.bean.condtion.LinuxCondition;
import com.atjiepi.bean.condtion.WindowCondition;
import org.springframework.context.annotation.*;

@Import({Color.class, Red.class, MyImport.class, MyImportBeanRegistrar.class})
@Configuration
public class Config2 {

    //    @Scope("prototype") //singleton  request session grabloseesion
    @Lazy
    @Bean
    public Person person() {
        System.out.println("容器注入");
        return new Person("12", "nihao");
    }

    //    @Conditional()
    @Conditional({WindowCondition.class})
    @Bean("window")
    public Person person01() {
        return new Person("windows", "12121");
    }

    @Conditional(LinuxCondition.class)
    @Bean("linux")
    public Person person02() {
        return new Person("linux", "34");
    }

    @Bean
    public MyFactoryBean factoryBean() {
        return new MyFactoryBean();
    }
}

