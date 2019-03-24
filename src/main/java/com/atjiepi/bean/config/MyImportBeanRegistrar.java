package com.atjiepi.bean.config;

import com.atjiepi.bean.Yellow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanRegistrar implements ImportBeanDefinitionRegistrar {


    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//        BeanDefinition beanDefinition = registry.getBeanDefinition("com.atjiepi.bean.Blue");
        boolean beanDefinition = registry.containsBeanDefinition("com.atjiepi.bean.Blue");
        boolean beanDefinition2 = registry.containsBeanDefinition("com.atjiepi.bean.Color");
        if(beanDefinition&&beanDefinition2){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Yellow.class);
            registry.registerBeanDefinition("yellow",rootBeanDefinition);
        }

    }

}
