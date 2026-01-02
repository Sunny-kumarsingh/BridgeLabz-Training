package com.inheritance.assistedproblem;

public class Truck extends Vechicle{
	int loadCapacity;
	
	Truck(int maxSpeed, String fuelType, int loadCapacity){
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println(loadCapacity);
		
	}
}	
