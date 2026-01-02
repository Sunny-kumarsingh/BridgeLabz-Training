package com.inheritance.assistedproblem;

public class Vechicle {
	int maxSpeed;
	String fuelType;
	
	Vechicle(int maxSpeed, String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	
	void displayInfo() {
		System.out.println("Maax Speed is : " + maxSpeed);
		System.out.println("Fuel type : "+ fuelType);
		
	}

}
