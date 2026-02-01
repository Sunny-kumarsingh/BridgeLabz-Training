package com.functionalinterface.defaultmethods.smartvehicle;
public class ElectricCar implements Vehicle {

    public void displaySpeed() {
        System.out.println("Electric Car speed: 70 km/h");
    }

    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}
