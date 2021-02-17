package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_single_table.service;

import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_single_table.repository.BatteryRepository;
import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_single_table.repository.SimRepository;
import org.springframework.stereotype.Service;

@Service
public class MobileService {
    private final BatteryRepository batteryRepository;
    private final SimRepository simRepository;

    public MobileService(BatteryRepository batteryRepository, SimRepository simRepository) {
        this.batteryRepository = batteryRepository;
        this.simRepository = simRepository;
    }
}
