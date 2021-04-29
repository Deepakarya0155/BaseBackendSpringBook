package com.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.school.entity.AppPropertiesEntity;
import com.school.entity.AppUser;
import com.school.repo.AppPropertiesRepo;
import com.school.repo.AppUserRepo;

@SpringBootApplication
@EnableCaching
public class SchoolManagementApplication implements CommandLineRunner{
	
	@Autowired
	AppUserRepo appUserRepo;
	
	@Autowired
	AppPropertiesRepo appPropertiesRepo;

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		AppUser user=new AppUser();
		user.setName("admin");
		user.setPassword(new BCryptPasswordEncoder().encode("admin"));
		user.setRole("A");
		
		AppUser normal=new AppUser();
		normal.setName("normal");
		normal.setPassword(new BCryptPasswordEncoder().encode("normal"));
		normal.setRole("N");
		
		appUserRepo.save(user);
		appUserRepo.save(normal);
		
		
		AppPropertiesEntity entity=new AppPropertiesEntity();
		entity.setName("APP_NAME");
		entity.setValue("Arya");
		
		
		appPropertiesRepo.save(entity);
		
		
	}

	
}
