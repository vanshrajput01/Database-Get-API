package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Employee;
import com.example.demo.getApiDto.ResponseDto;

@Repository
public interface getEmployeeRepository extends JpaRepository<Employee, Long>{
	
	@Query(value = "select emp_id,emp_name,emp_salary from employee\r\n"
			+ "where emp_id = :id",nativeQuery = true)

	public ResponseDto getEmployeeDetails(@RequestParam long id);
	
	
	

}
