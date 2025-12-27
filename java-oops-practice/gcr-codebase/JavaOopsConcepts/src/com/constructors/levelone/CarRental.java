package com.constructors.levelone;

public class CarRental {
	
	String customerName = "";
	String carModel = "";
	int rentalDays = 0;
	int costPerDay;
    int totalCost;
	
	public CarRental(String customerName, String carModel, int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.costPerDay = 1000; 
	        calculateTotalCost();
	}
	 void calculateTotalCost() {
	        totalCost = rentalDays * costPerDay;
	    }
	 // Method to display rental details
	    void display() {
	        System.out.println("Customer Name : " + customerName);
	        System.out.println("Car Model     : " + carModel);
	        System.out.println("Rental Days   : " + rentalDays);
	        System.out.println("Total Cost    : ₹" + totalCost);
	    }

}
