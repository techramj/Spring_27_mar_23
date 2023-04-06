package com.seed.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.seed.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addEmployee(Employee emp) {
		
		System.out.println("added to the db");
		
	}
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
