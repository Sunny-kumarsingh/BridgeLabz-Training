package com.inheritance.hybridinheritance;

public class Person {

    protected String name;
    protected int id;

    // Constructor to initialize common details
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display common information
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}