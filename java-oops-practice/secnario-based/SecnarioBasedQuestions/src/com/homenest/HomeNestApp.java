package com.homenest;
public class HomeNestApp {

    public static void main(String[] args) {

        Device light = new Light("Light-101");
        Device camera = new Camera("Cam-201");
        Device thermo = new Thermostat("Thermo-301");
        Device lock = new Lock("Lock-401");

        light.turnOn();
        camera.turnOn();

        System.out.println("Energy used by Light (5 hrs): "
                + light.calculateEnergy(5));

        System.out.println("Energy used by Camera (3 hrs): "
                + camera.calculateEnergy(3));

        // Polymorphism
        light.reset();
        camera.reset();
        thermo.reset();
        lock.reset();

        light.turnOff();
    }
}
