package com.functionalinterface.definingandImplementsInterface.multivehiclerentalsystem;

public class vehicleMain {
	public static void main(String[] args) {
		
		Vehicle car  = new Cars();
		Vehicle bike  = new Bike();
		Vehicle bus  = new Buse();
		
		car.rent();
		bike.rent();
		bus.rent();
		
		System.out.println("-------------");
		
		car.returnVehicle();
		bike.returnVehicle();
		bus.returnVehicle();
		
		
		
		
	}

}
