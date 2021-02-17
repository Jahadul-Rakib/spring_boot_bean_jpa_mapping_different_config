package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_table_per_class;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MobileOnePhone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mobileId;
    private String mobileModel;
    private String mobileCompany;

    public MobileOnePhone() {
    }

    public MobileOnePhone(String mobileModel, String mobileCompany) {
        this.mobileModel = mobileModel;
        this.mobileCompany = mobileCompany;
    }
}
