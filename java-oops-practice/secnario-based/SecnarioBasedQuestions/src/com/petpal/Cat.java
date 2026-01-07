package com.petpal;
public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    public void feed() {
        System.out.println(name + " is eating...");
        changeHunger(-15);
        showStatus();
    }

    public void play() {
        System.out.println(name + " is playing...");
        changeEnergy(-10);
        changeHunger(5);
        showStatus();
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
        changeEnergy(40);
        showStatus();
    }

    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}