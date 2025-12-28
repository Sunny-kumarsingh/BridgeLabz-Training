package com.constructors.levelone;

public class vehicleMain {
	
	public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Raj", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(6000);

        System.out.println("\nAfter Updating Registration Fee:\n");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }

}
