package com.school.entity;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntityMapper {
	@CreationTimestamp
	Date sysCreationDate;
	@UpdateTimestamp
	Date sysUpdateDate;

}
