package com.cabbygo;

public class RideServiceImpl implements IRideService {

    private double fare;   // hidden (encapsulation)

    @Override
    public void bookRide(Vechicle vehicle, Driver driver, double distance) {
        fare = vehicle.calculateFare(distance);

        System.out.println("Ride Booked");
        System.out.println("Vehicle Type : " + vehicle.getType());
        System.out.println("Driver : " + driver.getName());
        System.out.println("Driver Rating : " + driver.getRating());
        System.out.println("Estimated Fare : INR" + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride Ended ");
        System.out.println("Total Fare Paid : INR " + fare);
    }
}
