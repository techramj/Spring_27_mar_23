package com.easylearning.service;

import java.util.List;

import com.easylearning.bean.Employee;
import com.easylearning.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao empDao;

	@Override
	public void save(Employee emp) {
		empDao.save(emp);
		System.out.println("emloyee added successfully");
	}

	@Override
	public void update(Employee emp) {
		empDao.update(emp);
		
	}

	@Override
	public void delete(int id) {
		empDao.delete(id);
		
	}

	@Override
	public Employee findById(int id) {
		return empDao.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		return empDao.findAll();
	}
	
	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

}
