package com.easylearning;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.easylearning.bean.Employee;

public class Test {
	
	public static void main(String[] args) {
		//BeanFactoryVsApplicationContextExample();
		lifeCycleExample();
	}
	
	
	public static void lifeCycleExample() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		((ConfigurableApplicationContext)context).registerShutdownHook();
		
		Employee emp = null;
		emp = context.getBean("emp", Employee.class);
		System.out.println("using the bean: "+emp);
		
		Employee e1  = new Employee();		
	}
	
	public static void BeanFactoryVsApplicationContextExample() {
		//beanfacotory
		Resource res = new FileSystemResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
//		Employee emp = factory.getBean("emp", Employee.class);
//		System.out.println(emp);
//		
//		Employee empNew = factory.getBean("emp", Employee.class);
//		System.out.println(emp == empNew);
		
		
		System.out.println("------------------------------------------------------------------------");
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Employee emp1 = context.getBean("emp", Employee.class);
//		System.out.println(emp1);
		
	} 

}
