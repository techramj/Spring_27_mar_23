package com.easylearning.bean;

public class Student {
	
	private int rollNo;
	private String name;
	private Address address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(Address address) {
		System.out.println("constructor called "+ this.getClass().getName());
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
