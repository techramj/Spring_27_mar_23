package com.seed.service;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;

public class EmployeeServiceImpl implements EmpService {
	
	private EmployeeDao employeeDao;
	
	

	@Override
	public void addEmployee(Employee emp) {
		employeeDao.addEmployee(emp);		
	}
	
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	

}
