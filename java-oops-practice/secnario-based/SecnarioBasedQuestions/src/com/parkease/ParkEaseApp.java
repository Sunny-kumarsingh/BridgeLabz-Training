package com.parkease;
public class ParkEaseApp {

    public static void main(String[] args) {

        ParkingSlot slot = new ParkingSlot("S1", "City Center", "Car");
        Vehicle car = new Car("DL01AB1234");

        ParkingManager manager = new ParkingManager();
        manager.parkVehicle(slot);

        int hours = 6;
        double charges = car.calculateCharges(hours);

        System.out.println("Parking Charges: " + charges);
        System.out.println(manager.getLogs());

        manager.unparkVehicle(slot);
        System.out.println(manager.getLogs());
    }
}
