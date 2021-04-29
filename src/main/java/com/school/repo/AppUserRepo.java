package com.school.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entity.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser, Long> {

	
	public AppUser findByName(String name);
}
	