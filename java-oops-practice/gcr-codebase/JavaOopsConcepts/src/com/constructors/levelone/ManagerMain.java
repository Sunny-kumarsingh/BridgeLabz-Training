package com.constructors.levelone;

public class ManagerMain {
	public static void main(String[] args) {

        Manager m = new Manager(201, "IT", 60000, "Senior Manager");

        m.displayManagerDetails();

        // Modify salary using public method
        m.setSalary(75000);

        System.out.println("\nAfter Salary Update:");
        m.displayManagerDetails();
    }
}
