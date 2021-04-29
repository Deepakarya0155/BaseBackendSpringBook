package com.school.utils;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.school.entity.AppPropertiesEntity;
import com.school.repo.AppPropertiesRepo;
import java.util.stream.Collectors;

@Component
public class CommonUtils {
	
	public static Logger logger=LoggerFactory.getLogger(CommonUtils.class);
	
	public static Consumer debugLoggerConsumer=(A)->{
		if(logger.isDebugEnabled()) {
			logger.debug(A.toString());;
		}
	};
	public static Consumer infoLoggerConsumer=(A)->{
		if(logger.isInfoEnabled()) {
			logger.info(A.toString());;
		}
	};
	
	
	
	
	@Autowired
	AppPropertiesRepo appPropertiesRepo;
	

	@Cacheable("getDBProperties")
	public Map<String,String> getDBProperties(){
		debugLoggerConsumer.accept("Chach loaded app_properties");
		
		Map<String,String> map=appPropertiesRepo.findAll().stream()
		.collect(Collectors.toMap(AppPropertiesEntity::getName,AppPropertiesEntity::getValue));
		
		map.forEach((K,V)->{debugLoggerConsumer.accept(K+"-------->"+V);});
		return map;
	}
	

	
	
}
