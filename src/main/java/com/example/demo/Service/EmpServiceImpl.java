package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.getApiDto.DataDto;
import com.example.demo.getApiDto.ResponseDto;

@Service
public class EmpServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public ResponseDto addEmployeeData(DataDto data) {
		
		return this.empRepo.addEmployeeData;
	}
	
	

}
