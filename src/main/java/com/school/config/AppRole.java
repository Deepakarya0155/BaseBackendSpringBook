package com.school.config;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppRole implements GrantedAuthority {
	
	private String role;
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return role;
	}

}
