package com.inheritance.hybridinheritance;

public class Chef extends Person implements Worker {

    private String specialization;

    public Chef(String name, int id, String specialization) {
        super(name, id); // calling Person constructor
        this.specialization = specialization;
    }

    // Implementation of performDuties()
    @Override
    public void performDuties() {
        System.out.println("Role : Chef");
        System.out.println("Duties: Cooking " + specialization + " dishes");
    }
}