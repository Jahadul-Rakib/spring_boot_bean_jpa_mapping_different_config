package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_without_generating_super_class;

import javax.persistence.Entity;


@Entity
public class HeavyCar extends Vehicles{
    private Integer totalWheel;

    public HeavyCar(){

    }
    public HeavyCar(String nameOfVehicle, Integer totalGear, Integer totalWheel) {
        super(nameOfVehicle, totalGear);
        this.totalWheel = totalWheel;
    }
}
