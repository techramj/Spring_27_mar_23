package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.entity.Employee;
import com.seed.service.EmpService;
import com.seed.service.EmployeeServiceImpl;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmpService empService = context.getBean("empService", EmpService.class);
		empService.addEmployee(new Employee(111,"Jack",111111));	
	}

}
