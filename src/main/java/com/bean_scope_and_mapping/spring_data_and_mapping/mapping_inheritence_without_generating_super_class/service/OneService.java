package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_without_generating_super_class.service;

import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_without_generating_super_class.repository.HeavyCarRepository;
import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_without_generating_super_class.repository.RegularCarRepository;
import org.springframework.stereotype.Service;

@Service
public class OneService {
    private final HeavyCarRepository heavyCarRepository;
    private final RegularCarRepository regularCarRepository;

    public OneService(HeavyCarRepository heavyCarRepository, RegularCarRepository regularCarRepository) {
        this.heavyCarRepository = heavyCarRepository;
        this.regularCarRepository = regularCarRepository;
    }
    /*
    *
    * Others
    *
    *
    * */
}
