package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.EmployeeService;
import com.example.demo.getApiDto.ResponseDto;





public class EmpController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping(value = "/AddEmployee",consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> AddEmloyeeDetails(@RequestParam Long id){
		ResponseDto response = this.empService.getEmployeeData(id);
		return new ResponseEntity<>(response,HttpStatus.OK);
		
		
	}

}
