package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_single_table;

import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_single_table.enums.Body;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "BATTERY")
public class MobileBattery extends Mobile {
    @Enumerated(value = EnumType.STRING)
    private Body body;

    public MobileBattery() { }

    public MobileBattery(String mobileModel, String mobileCompany, Body body) {
        super(mobileModel, mobileCompany);
        this.body = body;
    }
}
