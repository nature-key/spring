package com.atjiepi.bean.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;

@PropertySource("classpath:/db.properties")
@Profile("dev")
@Configuration
public class MyConfigDataSource implements EmbeddedValueResolverAware {
    @Value("db.user")
    private String user;


    private String driver;
    private StringValueResolver stringValueResolver;

    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.stringValueResolver = resolver;
        String stringValue = resolver.resolveStringValue("${db.driver}");
        this.driver = stringValue;
    }
    @Profile("test")
    @Bean("datasourceTest")
    public DataSource getDataSourceTest(@Value("db.password") String pwd) throws Exception {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(pwd);
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        comboPooledDataSource.setDriverClass(driver);
        return comboPooledDataSource;
    }
    @Profile("dev")
    @Bean("datasourceDev")
    public DataSource getDataSourceDev(@Value("db.password") String pwd) throws Exception {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(pwd);
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        comboPooledDataSource.setDriverClass(driver);
        return comboPooledDataSource;
    }
    @Profile("prod")
    @Bean("datasourceProd")
    public DataSource getDataSourceProd(@Value("db.password") String pwd) throws Exception {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(pwd);
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        comboPooledDataSource.setDriverClass(driver);
        return comboPooledDataSource;
    }

}
