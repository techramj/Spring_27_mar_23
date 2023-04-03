package com.easylearning.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.easylearning.bean.Employee;

@Repository
public class EmployeeDaoImplWithJdbcTemplate implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(Employee emp) {
		jdbcTemplate.update(SQL_INSERT_EMP, 
				new Object[] { emp.getId(), emp.getName(), emp.getSalary() });
	}

	@Override
	public void update(Employee emp) {
		jdbcTemplate.update(SQL_UPDATE_EMP, 
				new Object[] {emp.getSalary(),emp.getName(), emp.getId()});
	}

	@Override
	public void delete(int id) {
		jdbcTemplate.update(SQL_DELETE_EMP, new Object[] { id });	
	}

	@Override
	public Employee findById(int id) {
		return jdbcTemplate.queryForObject(SQL_EMP_BY_ID, new Object[] { id }, new EmpRowMapper());
	}

	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query(SQL_FIND_ALL, new EmpRowMapper());
	}
	
	class EmpRowMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
			return emp;
		}
		
	}

}
