package com.seed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;

@Service(value = "empService")
public class EmployeeServiceImpl implements EmpService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee emp) {
		employeeDao.addEmployee(emp);
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
