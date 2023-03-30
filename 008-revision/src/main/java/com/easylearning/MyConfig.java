package com.easylearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.easylearning.bean.Employee;

@Configuration
public class MyConfig {
	
	@Bean
	public Employee emp1() {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Jack");
		emp1.setSalary(1000);
		return emp1;
	}
	
	
	@Bean
	public Employee emp2() {
		return new Employee(11, "Jackson", 11000);
	}

}
