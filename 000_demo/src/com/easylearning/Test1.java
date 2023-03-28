package com.easylearning;

import com.easylearning.bean.Car;
import com.easylearning.bean.Employee;
import com.easylearning.bean.Engine;

public class Test1 {
	
	public static void main(String[] args) {
		Engine engine = new Engine("Petrol",4,2000);
		Car car = new Car("Harrier");
		car.setEngine(engine);
		Employee emp = new Employee(1,"John",5000, car); 
		
		
	}

}
