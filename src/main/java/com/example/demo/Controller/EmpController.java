package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.getApiDto.ResponseDto;




@RestController
public class EmpController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/getEmployee")
	public ResponseDto AddEmloyeeDetails(@RequestParam Long id){
		
		return this.empService.getEmployeeData(id);
		
		
		
	}

}
