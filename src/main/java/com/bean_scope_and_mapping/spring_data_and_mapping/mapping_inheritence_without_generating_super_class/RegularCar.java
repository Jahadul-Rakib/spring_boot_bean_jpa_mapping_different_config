package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_without_generating_super_class;

import javax.persistence.Entity;

@Entity
public class RegularCar extends Vehicles {
    private Integer topSpeed;

    public RegularCar() { }
    public RegularCar(String nameOfVehicle, Integer totalGear, Integer topSpeed) {
        super(nameOfVehicle, totalGear);
        this.topSpeed = topSpeed;
    }


}
