package com.easylearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.bean.Employee;

public class Test {

	public static void main(String[] args) {
		example2();
	}
	
	public static void example2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp1 = context.getBean("emp", Employee.class);
		Employee emp2 = context.getBean("emp", Employee.class);
		System.out.println(emp1 == emp2);

	}

	

}
