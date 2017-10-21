package com.pnakaj.spring.ioc.propertyfileReading;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class AppConfig {


    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    public List getInfo() {
        System.out.println(driverClassName);
        return Arrays.asList(driverClassName);
    }

}
