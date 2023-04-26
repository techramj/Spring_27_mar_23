package com.seed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.dto.EmployeeDto;
import com.seed.entity.Employee;
import com.seed.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public Employee addEmployee(EmployeeDto empDto) {
		return empRepository.save(convertToEmp(empDto));
	}
	
	
	public Employee convertToEmp(EmployeeDto dto) {
		Employee emp = new Employee();
		emp.setName(dto.getFirstName()+" "+dto.getLastName());
		emp.setSalary(dto.getSalary());
		
		return emp;
	}

}
