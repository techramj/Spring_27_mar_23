package com.easylearning.service;

import java.util.List;

import com.easylearning.bean.Employee;

public interface EmployeeService {
	
	void save(Employee emp);
	void update(Employee emp);
	void delete(int id);
	Employee findById(int id);
	List<Employee> findAll();

}
