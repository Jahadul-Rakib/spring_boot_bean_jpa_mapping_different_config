package com.bean_scope_and_mapping.application_contex;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Application_contex_in_non_spring_class implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Application_contex_in_non_spring_class.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
    public static <T> T getBean(Class<T> className){
        return applicationContext.getBean(className);
    }
}
