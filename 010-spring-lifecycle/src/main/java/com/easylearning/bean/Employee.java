package com.easylearning.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private int id;
	private String name;

	public Employee() {
		System.out.println("EMp default constructor called!!!!");

	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setId method called");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName method called: name="+name);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext method called");
		
	}
	
	public void customInit() {
		System.out.println("employee custom init method called");
	}
	
	public void customDestroy() {
		System.out.println("Employee custom destroy method called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initalizing bean afterPropertiesSet method called");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable bean destory method called");
		
	}

}
