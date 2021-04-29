package com.school.config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.school.entity.AppUser;


public class AppUserDetails implements UserDetails{
	
	
	AppUser appUser;
	
	public AppUserDetails(AppUser appUser) {
		this.appUser=appUser;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		AppRole role=new AppRole();
		role.setRole(this.appUser.getRole());
		return Arrays.asList(role);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return appUser.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return appUser.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
