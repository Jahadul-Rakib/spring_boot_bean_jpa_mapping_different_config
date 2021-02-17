package com.bean_scope_and_mapping.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Scope(value = "singleton") scope also can be define in class
public class Person {
    private Integer userId;
    private String userName;
    private String userArea;
    private String userNumber;
}
