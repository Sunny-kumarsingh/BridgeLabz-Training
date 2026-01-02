package com.encapsulationpolymorphisminterfaceandabstract.ridehailingapplication;

abstract class Vehicle {

    // Encapsulation
    private int vehicleId;
    private String driverName;
    protected double ratePerKm;

    // Constructor
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Driver     : " + driverName);
        System.out.println("Rate/Km    : " + ratePerKm);
    }
}
