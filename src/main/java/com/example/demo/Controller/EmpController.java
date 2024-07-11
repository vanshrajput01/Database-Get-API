package com.example.demo.Controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


public class EmpController {
	
	@GetMapping(value = "/AddEmployee",consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> AddEmloyeeDetails(){
		
	}

}
