package com.easylearning.bean;

public class Car extends Vehicle {

	private String name;
	private Engine engine;

	public Car() {
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
