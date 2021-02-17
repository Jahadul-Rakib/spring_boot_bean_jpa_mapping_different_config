package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritance_as_join_table.repository;

import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritance_as_join_table.MobilePhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MobilePhoneRepository extends JpaRepository<MobilePhone, Long> {
}
