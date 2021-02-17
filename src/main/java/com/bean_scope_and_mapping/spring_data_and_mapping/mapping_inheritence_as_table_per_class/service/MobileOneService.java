package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_table_per_class.service;

import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_table_per_class.repository.MobileOneBatteryOnePhoneRepository;
import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_table_per_class.repository.MobileSimOnePhoneRepository;
import org.springframework.stereotype.Service;

@Service
public class MobileOneService {
    private final MobileOneBatteryOnePhoneRepository mobileBatteryRepository;
    private final MobileSimOnePhoneRepository mobileSimRepository;

    public MobileOneService(MobileOneBatteryOnePhoneRepository mobileBatteryRepository, MobileSimOnePhoneRepository mobileSimRepository) {
        this.mobileBatteryRepository = mobileBatteryRepository;
        this.mobileSimRepository = mobileSimRepository;
    }
}
