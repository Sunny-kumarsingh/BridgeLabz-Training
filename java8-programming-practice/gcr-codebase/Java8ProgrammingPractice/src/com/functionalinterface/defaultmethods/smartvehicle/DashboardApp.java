package com.functionalinterface.defaultmethods.smartvehicle;
public class DashboardApp {

    public static void main(String[] args) {

        Vehicle normalCar = new Car();
        Vehicle ev = new ElectricCar();

        normalCar.displaySpeed();
        // default method
        normalCar.displayBattery();  

        ev.displaySpeed();
        // overridden method
        ev.displayBattery();         
    }
}
