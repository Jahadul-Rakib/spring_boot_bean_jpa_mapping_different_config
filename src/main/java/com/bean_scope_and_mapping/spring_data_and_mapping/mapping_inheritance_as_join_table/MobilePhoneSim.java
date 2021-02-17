package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritance_as_join_table;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name = "SIM")
public class MobilePhoneSim extends MobilePhone {
    private String simCompanyName;

    public MobilePhoneSim() {
    }
    public MobilePhoneSim(String mobileModel, String mobileCompany, String simCompanyName) {
        super(mobileModel, mobileCompany);
        this.simCompanyName = simCompanyName;
    }
}
