package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Service.EmployeeService;
import com.example.demo.getApiDto.DataDto;
import com.example.demo.getApiDto.ResponseDto;





public class EmpController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping(value = "/AddEmployee",consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> AddEmloyeeDetails(@RequestBody  DataDto data){
		ResponseDto response = this.empService.addEmployeeData(data);
		return new ResponseEntity<>(response,HttpStatus.OK);
		
		
	}

}
