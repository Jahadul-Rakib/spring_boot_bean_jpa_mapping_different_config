package com.bean_scope_and_mapping.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulerConfig {

    //Scheduler will run every 30 second later
    @Scheduled(fixedDelay = 30000)
    public void print(){
        System.out.println("Calling from Scheduler.");
    }
}
