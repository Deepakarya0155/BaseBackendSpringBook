package com.school.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="App_properties")
@Getter
@Setter
public class AppPropertiesEntity extends BaseEntityMapper{
	
	@Id
	@GeneratedValue
	Long prop_id;
	
	String name;
	String value;
}
