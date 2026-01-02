package com.inheritance.hybridinheritance;

public class VehicleManagementSystem {

    public static void main(String[] args) {

        Vehicle ev = new ElectricVehicle("Tesla Model 3", 225, 60);
        Vehicle pv = new PetrolVehicle("Honda City", 180, 40);

        System.out.println("----- Electric Vehicle -----");
        ev.displayInfo();
        ((ElectricVehicle) ev).charge();

        System.out.println("\n----- Petrol Vehicle -----");
        pv.displayInfo();
        ((PetrolVehicle) pv).refuel();
    }
}