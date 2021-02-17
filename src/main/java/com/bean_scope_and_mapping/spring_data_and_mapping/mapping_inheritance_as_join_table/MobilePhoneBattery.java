package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritance_as_join_table;

import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritance_as_join_table.enums.Body;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "BATTERY")
public class MobilePhoneBattery extends MobilePhone {
    @Enumerated(value = EnumType.STRING)
    private Body body;

    public MobilePhoneBattery() { }

    public MobilePhoneBattery(String mobileModel, String mobileCompany, Body body) {
        super(mobileModel, mobileCompany);
        this.body = body;
    }
}
