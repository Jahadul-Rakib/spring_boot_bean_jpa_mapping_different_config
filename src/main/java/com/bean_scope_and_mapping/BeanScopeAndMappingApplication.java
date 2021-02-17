package com.bean_scope_and_mapping;

import com.bean_scope_and_mapping.application_contex.NonSpringClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanScopeAndMappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanScopeAndMappingApplication.class, args);
        NonSpringClass nonSpringClass = new NonSpringClass();
        nonSpringClass.getBean();
    }

}
