package com.example.demo.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.getEmployeeRepository;
import com.example.demo.getApiDto.ResponseDto;

@Service
public class EmpServiceImpl implements EmployeeService{
	
	@Autowired
	public getEmployeeRepository getEmpRepo;

	@Override
	public ResponseDto getEmployeeData(Long id) {
		return this.getEmpRepo.getEmployeeDetails(id);
		
		
	}
	


	
	

}
