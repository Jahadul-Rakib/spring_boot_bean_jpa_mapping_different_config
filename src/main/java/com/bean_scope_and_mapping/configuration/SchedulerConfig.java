package com.bean_scope_and_mapping.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class SchedulerConfig {

    //Scheduler will run every 30 second later
    //@Scheduled(fixedDelay = 30000)
    public void print(){
        System.out.println("Calling from Scheduler.");
    }
}
