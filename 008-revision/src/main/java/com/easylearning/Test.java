package com.easylearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.bean.Address;
import com.easylearning.bean.Employee;

public class Test {

	public static void main(String[] args) {
		//createBeanInSpringUsingConfigClass();
		//createBeanUsingAnnotationAndXmlConfiguration();
		
		createBeanUsingAnnotationAndJavaConfiguration();
		
	}
	
	
	public static void createBeanUsingAnnotationAndJavaConfiguration() {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyNewConfiguration.class);
		
		Address add = context.getBean("address", Address.class);
		System.out.println(add);
	}
	
	public static void createBeanUsingAnnotationAndXmlConfiguration() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		
		Address add = context.getBean("address", Address.class);
		System.out.println(add);
	}
	
	public static void createBeanInSpringUsingConfigClass() {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Employee emp1 = (Employee) context.getBean("emp1");
		Employee emp2 = context.getBean("emp2", Employee.class);

		System.out.println(emp1);
		System.out.println(emp2);
	}

	public static void createOBjectInSpring() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		Employee emp2 = context.getBean("emp2", Employee.class);

		System.out.println(emp1);
		System.out.println(emp2);

	}

	public static void createObjectInCoreJava() {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Jack");
		emp1.setSalary(1000);

		Employee emp2 = new Employee(11, "Jackson", 11000);
	}

}
