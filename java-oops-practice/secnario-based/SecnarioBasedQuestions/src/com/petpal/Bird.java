package com.petpal;
public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    public void feed() {
        System.out.println(name + " is eating seeds...");
        changeHunger(-10);
        showStatus();
    }

    public void play() {
        System.out.println(name + " is flying...");
        changeEnergy(-5);
        changeHunger(5);
        showStatus();
    }

    public void sleep() {
        System.out.println(name + " is resting...");
        changeEnergy(25);
        showStatus();
    }

    public void makeSound() {
        System.out.println("Bird says: Chirp Chirp!");
    }
}