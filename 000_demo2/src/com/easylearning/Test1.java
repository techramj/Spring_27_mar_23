package com.easylearning;

import com.easylearning.bean.Bike;
import com.easylearning.bean.Car;
import com.easylearning.bean.Employee;
import com.easylearning.bean.Engine;
import com.easylearning.bean.Suv;

public class Test1 {
	
	public static void main(String[] args) {
		Engine engine = new Engine("Petrol",4,2000);
		Car car = new Car("Harrier");
		Bike bike = new Bike("Yezdi");
		Suv suv = new Suv();
		Employee emp = new Employee(1,"John",5000, suv); 
	}

}
