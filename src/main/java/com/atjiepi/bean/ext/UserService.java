package com.atjiepi.bean.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @EventListener(classes = ApplicationEvent.class)
    public void listener(ApplicationEvent event){
        System.out.println("source:"+event.getSource());

    }
}
