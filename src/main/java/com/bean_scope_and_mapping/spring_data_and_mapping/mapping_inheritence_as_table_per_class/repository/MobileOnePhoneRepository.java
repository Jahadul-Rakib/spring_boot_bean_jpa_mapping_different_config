package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_table_per_class.repository;

import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_table_per_class.MobileOnePhone;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface MobileOnePhoneRepository extends JpaRepository<MobileOnePhone, Long> {
}
