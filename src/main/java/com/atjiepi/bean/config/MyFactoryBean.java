package com.atjiepi.bean.config;

import com.atjiepi.bean.Color;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Color> {


    public Color getObject() throws Exception {
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
