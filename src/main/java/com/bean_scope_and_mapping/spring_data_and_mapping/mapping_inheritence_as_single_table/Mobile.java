package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_single_table;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "MOBILE_TYPE",
        discriminatorType = DiscriminatorType.STRING
)
public abstract class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mobileId;
    private String mobileModel;
    private String mobileCompany;

    public Mobile() {
    }

    public Mobile(String mobileModel, String mobileCompany) {
        this.mobileModel = mobileModel;
        this.mobileCompany = mobileCompany;
    }
}
