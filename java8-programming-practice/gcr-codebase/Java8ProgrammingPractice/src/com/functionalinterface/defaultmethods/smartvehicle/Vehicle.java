package com.functionalinterface.defaultmethods.smartvehicle;
public interface Vehicle {

    void displaySpeed();

    // new feature for electric vehicles
    default void displayBattery() {
        System.out.println("Battery info not available");
    }
}
