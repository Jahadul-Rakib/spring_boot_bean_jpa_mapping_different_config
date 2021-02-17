package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritance_as_join_table.service;

import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritance_as_join_table.repository.MobileBatteryPhoneRepository;
import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritance_as_join_table.repository.MobileSimPhoneRepository;
import org.springframework.stereotype.Service;

@Service
public class MobilePhoneService {
    private final MobileBatteryPhoneRepository mobileBatteryRepository;
    private final MobileSimPhoneRepository mobileSimRepository;

    public MobilePhoneService(MobileBatteryPhoneRepository mobileBatteryRepository, MobileSimPhoneRepository mobileSimRepository) {
        this.mobileBatteryRepository = mobileBatteryRepository;
        this.mobileSimRepository = mobileSimRepository;
    }
}
