package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_table_per_class;

import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_table_per_class.enums.Body;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "BATTERY")
public class MobileOnePhoneBattery extends MobileOnePhone {
    @Enumerated(value = EnumType.STRING)
    private Body body;

    public MobileOnePhoneBattery() { }

    public MobileOnePhoneBattery(String mobileModel, String mobileCompany, Body body) {
        super(mobileModel, mobileCompany);
        this.body = body;
    }
}
