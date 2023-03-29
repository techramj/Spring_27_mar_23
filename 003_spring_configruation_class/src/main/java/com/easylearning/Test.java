package com.easylearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.bean.Car;
import com.easylearning.bean.Employee;

public class Test {

	public static void main(String[] args) {
		example2();
	}
	
	public static void example2() {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		printLine();
		Employee emp1 = context.getBean("emp", Employee.class);
		printLine();
		Employee emp2 = context.getBean("emp", Employee.class);
		printLine();
	
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car);

	}
	
	
	public static void printLine() {
		System.out.println("_________________________________________________________\n");
	}

	

}
