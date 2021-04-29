package com.school.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="App_user")
@ToString
public class AppUser {
	
	@Id
	@GeneratedValue
	Long id;
	
	String name;
	String password;
	String role;
	
	
}
