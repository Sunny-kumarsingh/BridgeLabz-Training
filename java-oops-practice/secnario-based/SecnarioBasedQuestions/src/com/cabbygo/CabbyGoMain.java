package com.cabbygo;

public class CabbyGoMain {
	 public static void main(String[] args) {

	        Vechicle vehicle = new Sedan("MH12XY7890"); 
	        Driver driver = new Driver("Rohit", "DL123456", 4.8);

	        IRideService rideService = new RideServiceImpl();
	        rideService.bookRide(vehicle, driver, 12);
	        rideService.endRide();
	    }
}
