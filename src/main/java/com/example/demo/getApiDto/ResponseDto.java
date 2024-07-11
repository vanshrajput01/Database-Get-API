package com.example.demo.getApiDto;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface ResponseDto {
	
	@JsonProperty("emp_id")
	public Long getemp_id();
	
	@JsonProperty("emp_name")
	public String getemp_name();
	
	@JsonProperty("emp_salary")
	public String getemp_salary();
	
	

}
