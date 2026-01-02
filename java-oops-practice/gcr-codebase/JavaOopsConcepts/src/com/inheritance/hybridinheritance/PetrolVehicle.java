package com.inheritance.hybridinheritance;

public class PetrolVehicle extends Vehicle implements Refuelable {
    
	// in liters
    private int fuelTankCapacity; 

    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implementation of refuel() from Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
        System.out.println("Fuel Tank Capacity : " + fuelTankCapacity + " liters");
    }
}