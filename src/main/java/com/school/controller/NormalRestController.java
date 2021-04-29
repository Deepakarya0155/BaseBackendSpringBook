package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.utils.CommonUtils;

@RestController
@RequestMapping("N")
public class NormalRestController {
	
	@Autowired
	CommonUtils commonUtils;

	@GetMapping("test")
	public String normalTest() {
		
		;
		return "normal";
	}
	
	@GetMapping("readProperties/{key}")
	public String readProperties(@PathVariable("key")String key) {
		return commonUtils.getDBProperties().get(key);
	}

	@GetMapping("refreshCache")
	@CacheEvict({"getDBProperties"})
	public void refreshCache() {
		System.out.println("Cache refresh called");
	}

	
}
