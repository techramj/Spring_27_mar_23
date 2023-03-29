package com.easylearning.bean;

public class Car extends Vehicle {
	private String name;

	public Car() {
		System.out.println("Car default constructor called");
	}

	public Car(String name) {
		System.out.println("Car Parameterized constructor called");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}

}
