package com.easylearning;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.bean.Employee;
import com.easylearning.service.EmployeeService;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService empService = context.getBean("employeeServiceImpl", EmployeeService.class);
		/*
		empService.save(new Employee(8,"Suresh",1000));
		
		//udpate the salary,name of employee id 1
		pause(10);
		Employee e1 = new Employee(1,"Manohar", 15000);
		empService.update(e1);
		
		//delete empl with id =3
		pause(10);
		empService.delete(3);
		
		//fetch the detail of id=41
		pause(10);
		Employee e2 = empService.findById(41);
		System.out.println(e2);
		
		
		//fetch all employees
		pause(10);
		*/
		List<Employee> empList = empService.findAll();
		for(Employee e: empList) {
			System.out.println(e);
		}
	}
	
	private static void pause(int t) {
		System.out.println("\n\n");
		try {
			Thread.sleep(t*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
