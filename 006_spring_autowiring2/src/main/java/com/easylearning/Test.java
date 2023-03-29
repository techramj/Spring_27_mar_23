package com.easylearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.bean.Address;
import com.easylearning.bean.Bike;
import com.easylearning.bean.Car;
import com.easylearning.bean.Employee;
import com.easylearning.bean.Student;

public class Test {

	public static void main(String[] args) {
		example1();
	}
	

	public static void example1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println("emp: "+emp);
		System.out.println("vehicle: "+emp.getBike());
		System.out.println("project: "+emp.getProject1());
		
		System.out.println("-----------------------------------------");
		Student student = context.getBean("student", Student.class);
		System.out.println(student+"  "+student.getAddress());
		
		
	}

}
