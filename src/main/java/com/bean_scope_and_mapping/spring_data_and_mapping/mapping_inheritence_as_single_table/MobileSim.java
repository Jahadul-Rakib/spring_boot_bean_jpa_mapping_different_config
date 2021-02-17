package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_single_table;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name = "SIM")
public class MobileSim extends Mobile{
    private String simCompanyName;

    public MobileSim() {
    }
    public MobileSim(String mobileModel, String mobileCompany, String simCompanyName) {
        super(mobileModel, mobileCompany);
        this.simCompanyName = simCompanyName;
    }
}
