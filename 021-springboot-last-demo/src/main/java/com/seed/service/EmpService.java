package com.seed.service;

import com.seed.dto.EmployeeDto;
import com.seed.entity.Employee;

public interface EmpService {
	
	Employee addEmployee(EmployeeDto empDto);
}
