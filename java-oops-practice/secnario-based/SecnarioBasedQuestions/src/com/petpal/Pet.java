package com.petpal;
public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated state
    private int hunger;
    private int energy;
    private String mood;

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 50;
        this.energy = 50;
        updateMood();
    }

    protected void changeHunger(int value) {
        hunger = Math.max(0, Math.min(100, hunger + value));
        autoEnergyCalculation();
        updateMood();
    }

    protected void changeEnergy(int value) {
        energy = Math.max(0, Math.min(100, energy + value));
        updateMood();
    }

    // Automatic energy calculate
    private void autoEnergyCalculation() {
        if (hunger > 70) {
            energy -= 10;
        } else if (hunger < 30) {
            energy += 5;
        }
        energy = Math.max(0, Math.min(100, energy));
    }

    //  Mood calculation
    private void updateMood() {
        if (energy > 70 && hunger < 30) {
            mood = "Happy";
        } else if (energy < 30 || hunger > 70) {
            mood = "Sad";
        } else {
            mood = "Neutral";
        }
    }

    // show status
    public void showStatus() {
        System.out.println("\n--- Pet Status ---");
        System.out.println("Pet    : " + name + " (" + type + ")");
        System.out.println("Age    : " + age);
        System.out.println("Energy : " + energy);
        System.out.println("Hunger : " + hunger);
        System.out.println("Mood   : " + mood);
        System.out.println("---------------------------");
    }

    // for sound
    public abstract void makeSound();
}
