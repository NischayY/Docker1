package com.example.demodependcy.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class Dependency {
	
	@GetMapping("/allStudents")
	public String getAllStudents(){
		return "helloworld";
	}
	
	
	
	
	

}


