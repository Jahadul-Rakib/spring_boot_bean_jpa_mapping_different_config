package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_without_generating_super_class;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameOfVehicle;
    private Integer totalGear;

    public Vehicles() {
    }

    public Vehicles(String nameOfVehicle, Integer totalGear) {
        this.nameOfVehicle = nameOfVehicle;
        this.totalGear = totalGear;
    }
}
