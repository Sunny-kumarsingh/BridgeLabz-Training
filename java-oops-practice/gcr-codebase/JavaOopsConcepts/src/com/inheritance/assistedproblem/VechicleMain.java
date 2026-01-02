package com.inheritance.assistedproblem;

public class VechicleMain {
	 public static void main(String[] args) {

	        Vechicle[] vehicles = new Vechicle[3];

	        vehicles[0] = new Car(180, "Petrol", 5);
	        vehicles[1] = new Truck(120, "Diesel", 10);
	        vehicles[2] = new Motorcycle(140, "Petrol",2);

	        for (Vechicle v : vehicles) {
	            System.out.println("----- Vehicle Info -----");
	            v.displayInfo();   // runtime polymorphism
	        }
	    }

}
