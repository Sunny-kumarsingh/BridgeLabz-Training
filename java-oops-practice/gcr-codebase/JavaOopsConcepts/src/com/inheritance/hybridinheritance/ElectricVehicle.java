package com.inheritance.hybridinheritance;

public class ElectricVehicle extends Vehicle {
	// in kWh
    private int batteryCapacity; 

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method specific to electric vehicles
    public void charge() {
        System.out.println("Charging electric vehicle...");
        System.out.println("Battery Capacity : " + batteryCapacity + " kWh");
    }
}