package com.example.demo.getApiDto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDto {
	
	@JsonProperty("emp_id")
	public Long getEmp_id;
	
	@JsonProperty("emp_name")
	public String getEmp_anme;
	
	
	@JsonProperty("emp_salary")
	public Long getEmp_salary;
	
	
	
	

}
