package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritance_as_join_table;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class MobilePhone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mobileId;
    private String mobileModel;
    private String mobileCompany;

    public MobilePhone() {
    }

    public MobilePhone(String mobileModel, String mobileCompany) {
        this.mobileModel = mobileModel;
        this.mobileCompany = mobileCompany;
    }
}
