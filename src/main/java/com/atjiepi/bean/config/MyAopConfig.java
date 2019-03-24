package com.atjiepi.bean.config;

import com.atjiepi.bean.aop.AspectConfig;
import com.atjiepi.bean.aop.MathAop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class MyAopConfig {

    @Bean
    public AspectConfig aspectConfig() {

        return new AspectConfig();
    }

    @Bean
    public MathAop mathAop() {
        return new MathAop();
    }


}
