package com.easylearning.dao;

import java.util.List;

import com.easylearning.bean.Employee;

public interface EmployeeDao {
	String SQL_INSERT_EMP = "insert into emp(id,name,salary) values (?,?,?)";
	String SQL_UPDATE_EMP = "update emp set salary=?, name=? where id= ?";
	String SQL_DELETE_EMP = "delete from emp where id =?";
	String SQL_EMP_BY_ID = "select * from emp where id =?";
	String SQL_FIND_ALL = "select * from emp";
	
	void save(Employee emp);
	void update(Employee emp);
	void delete(int id);
	Employee findById(int id);
	List<Employee> findAll();

}
