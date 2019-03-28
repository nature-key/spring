package com.atjiepi.bean.ext;

import com.atjiepi.bean.Blue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefnationPostProcess implements BeanDefinitionRegistryPostProcessor {
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        int count = registry.getBeanDefinitionCount();
        String[] names = registry.getBeanDefinitionNames();
//        RootBeanDefinition beanDefinition = new RootBeanDefinition(Blue.class);
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Blue.class).getBeanDefinition();
        registry.registerBeanDefinition("hello",beanDefinition);
        System.out.println("postProcessBeanDefinitionRegistry...."+count);
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int count = beanFactory.getSingletonCount();
        String[] definitionNames = beanFactory.getBeanDefinitionNames();
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        System.out.println("postProcessBeanFactory....."+beanDefinitionCount);
    }
}
