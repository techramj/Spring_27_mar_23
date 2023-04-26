package com.seed.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seed.dto.EmployeeDto;
import com.seed.entity.Employee;
import com.seed.service.EmpService;

@RestController
public class EmployeeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmpService empService;
	
	@PostMapping("/employee/add")
	public Employee addEmployee(@RequestBody EmployeeDto empDto) {
		LOGGER.info("Employee details: ");
		LOGGER.info(""+empDto);
		Employee emp =empService.addEmployee(empDto);
		LOGGER.info("emp added successfully!!!!!!!");
		LOGGER.info("data "+empDto+" added by "+empDto.getUpdatedBy());
		return emp;
	}

}
