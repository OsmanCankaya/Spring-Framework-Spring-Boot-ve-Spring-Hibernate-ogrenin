package com.carwasher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class CarWasherConfiguration {
    @Autowired
    private  CarWasherProperties carWasherProperties;

    @PostConstruct
    public void init(){
        System.out.println("Load Test Data "+carWasherProperties.getLoadTestData());
    }
}
