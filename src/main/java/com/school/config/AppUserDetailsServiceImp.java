package com.school.config;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.school.entity.AppUser;
import com.school.repo.AppUserRepo;

@Service
public class AppUserDetailsServiceImp implements UserDetailsService{
	
	Logger logger=Logger.getLogger("securityLogger");
	
	@Autowired
	AppUserRepo appUserRepo;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser user=appUserRepo.findByName(username);
		logger.error(user);
		if(user==null) {
			throw new UsernameNotFoundException("Invalid user Id : "+username);
		}
		return new AppUserDetails(user);
	}

}
