package com.easylearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.bean.Employee;

public class Test {

	public static void main(String[] args) {
		example1();
	}
	

	public static void example1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp1 = (Employee) context.getBean("emp");
		System.out.println(emp1);
		System.out.println("Vehicle: "+emp1.getVehicle());
		System.out.println("Project: "+emp1.getProject());

		
	}

}
