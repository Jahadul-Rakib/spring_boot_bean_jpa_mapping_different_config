package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_table_per_class;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name = "SIM")
public class MobileOnePhoneSim extends MobileOnePhone {
    private String simCompanyName;

    public MobileOnePhoneSim() {
    }
    public MobileOnePhoneSim(String mobileModel, String mobileCompany, String simCompanyName) {
        super(mobileModel, mobileCompany);
        this.simCompanyName = simCompanyName;
    }
}
