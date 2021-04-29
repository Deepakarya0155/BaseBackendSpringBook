package com.school.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("A")
public class AdminRestController {
	
	
	@GetMapping("test")
	public String adminTest() {
		return "admin";
	}

}
