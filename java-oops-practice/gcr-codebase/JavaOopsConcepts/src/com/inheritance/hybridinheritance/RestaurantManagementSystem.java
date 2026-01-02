package com.inheritance.hybridinheritance;

public class RestaurantManagementSystem {

    public static void main(String[] args) {

        // Polymorphism using interface reference
        Worker chef = new Chef("Rohit", 101, "Italian");
        Worker waiter = new Waiter("Amit", 201, 5);

        System.out.println("----- Chef Details -----");
        ((Chef) chef).displayDetails(); // Person method
        chef.performDuties();           // Worker method

        System.out.println("\n----- Waiter Details -----");
        ((Waiter) waiter).displayDetails();
        waiter.performDuties();
    }
}