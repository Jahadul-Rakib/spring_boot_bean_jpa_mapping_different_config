package com.bean_scope_and_mapping.application_contex;

import com.bean_scope_and_mapping.domain.Person;

public class NonSpringClass {
    public void getBean(){
        Person person = Application_contex_in_non_spring_class.getBean(Person.class);
        System.out.println(person);
    }
}
