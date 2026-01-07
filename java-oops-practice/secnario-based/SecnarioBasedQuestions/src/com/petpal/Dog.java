package com.petpal;
public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    public void feed() {
        System.out.println(name + " is eating...");
        changeHunger(-20);
        showStatus();   // auto show
    }

    public void play() {
        System.out.println(name + " is playing...");
        changeEnergy(-15);
        changeHunger(10);
        showStatus();
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
        changeEnergy(30);
        showStatus();
    }

    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}