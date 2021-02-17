package com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_single_table.repository;

import com.bean_scope_and_mapping.spring_data_and_mapping.mapping_inheritence_as_single_table.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MobileRepository extends JpaRepository<Mobile, Long> {
}
