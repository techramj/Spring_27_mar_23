package com.easylearning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.easylearning.bean.Employee;

public class EmployeeDaoImplWithConnection implements EmployeeDao {
	
	private DataSource dataSource;

	@Override
	public void save(Employee emp) {
		Connection con = getConnection();
		try(PreparedStatement ps= con.prepareStatement(SQL_INSERT_EMP)){
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private Connection getConnection() {
		try {
			Connection con = dataSource.getConnection();
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
