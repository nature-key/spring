package com.atjiepi.bean.ext;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcess  implements BeanFactoryPostProcessor{
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int count = beanFactory.getBeanPostProcessorCount();
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        System.out.println("beanDefinitionCount:"+beanDefinitionCount);
        String[] names = beanFactory.getBeanDefinitionNames();
        System.out.println("count:"+count);
        for (String name:names
             ) {
            System.out.println(name);
        }
    }
}
