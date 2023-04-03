package com.easylearning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.easylearning.bean.Employee;

@Repository
@Primary
public class EmployeeDaoImplWithConnection implements EmployeeDao {
	
	@Autowired
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
		Connection con = getConnection();
		Employee emp = null;
		try(PreparedStatement ps = con.prepareStatement(SQL_EMP_BY_ID)){
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> findAll() {
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
