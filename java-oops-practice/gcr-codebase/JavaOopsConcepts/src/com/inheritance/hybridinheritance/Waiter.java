package com.inheritance.hybridinheritance;

public class Waiter extends Person implements Worker {

    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
    	// calling Person constructor
        super(name, id); 
        this.tablesAssigned = tablesAssigned;
    }

    // Implementation of performDuties()
    @Override
    public void performDuties() {
        System.out.println("Role : Waiter");
        System.out.println("Duties: Serving customers at " + tablesAssigned + " tables");
    }
}