package com.easylearning.bean;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;

	public Address() {	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

}
