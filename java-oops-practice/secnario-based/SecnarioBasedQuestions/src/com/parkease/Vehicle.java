package com.parkease;
public class Vehicle implements IPayable {

    protected String vehicleNumber;
    protected double baseRate;

    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    @Override
    public double calculateCharges(int hours) {
        return baseRate * hours;
    }
}
