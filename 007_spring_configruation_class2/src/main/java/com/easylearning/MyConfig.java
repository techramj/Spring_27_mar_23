package com.easylearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.easylearning.bean.Car;
import com.easylearning.bean.Employee;
import com.easylearning.bean.Vehicle;

@Configuration
@ComponentScan(basePackages = {"com.easylearning.bean"})
public class MyConfig {
	
	@Bean
	public Employee emp() {
		Employee emp = new Employee();
		emp.setVehicle(car());
		return emp;
	}
	
	
	@Bean
	public Vehicle car() {
		return new Car("Grand Vitara");
	}
	
	
	@Bean
	public Date date() {
		Date date = new Date();
		return date;
	}

}
