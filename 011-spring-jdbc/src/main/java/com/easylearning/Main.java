package com.easylearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.bean.Employee;
import com.easylearning.service.EmployeeService;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService empService = context.getBean("empService", EmployeeService.class);
		empService.save(new Employee(41,"Ramesh",1000));
	}

}
