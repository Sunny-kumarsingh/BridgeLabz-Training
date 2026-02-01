package com.functionalinterface.definingandImplementsInterface.multivehiclerentalsystem;

public class Cars implements Vehicle {
	
	public void rent() {
		System.out.println("Car rented ");
	}
	public void returnVehicle() {
		System.out.println("car return ");
	}

}
