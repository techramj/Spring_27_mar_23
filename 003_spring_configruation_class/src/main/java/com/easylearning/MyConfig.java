package com.easylearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.easylearning.bean.Car;
import com.easylearning.bean.Employee;
import com.easylearning.bean.Vehicle;

@Configuration
public class MyConfig {
	
	@Bean
	@Scope(value = "prototype")
	public Employee emp() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Jack");
		emp.setSalary(3000);
		emp.setVehicle(car());
		return emp;
	}
	
	
	@Bean
	@Scope(value = "prototype")
	public Vehicle car() {
		return new Car("Grand Vitara");
	}

}
