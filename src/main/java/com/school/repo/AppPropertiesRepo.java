package com.school.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.entity.AppPropertiesEntity;

@Repository
public interface AppPropertiesRepo extends JpaRepository<AppPropertiesEntity, Long> {

	
}
