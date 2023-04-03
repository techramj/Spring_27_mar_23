package com.easylearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.easylearning.bean.Employee;
import com.easylearning.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	//@Qualifier("employeeDaoImplWithJdbcTemplate")
	@Autowired
	private EmployeeDao empDao;

	@Override
	public void save(Employee emp) {
		empDao.save(emp);
		System.out.println("emloyee added successfully");
	}

	@Override
	public void update(Employee emp) {
		empDao.update(emp);
		System.out.println("employee updated successfully");
	}

	@Override
	public void delete(int id) {
		empDao.delete(id);
		System.out.println("employee with id "+id+" deleted successfully!");
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
