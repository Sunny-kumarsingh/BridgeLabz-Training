package com.functionalinterface.staticmethod.unitconvert;
public class LogisticsApp {

    public static void main(String[] args) {

        double distanceKm = 10;
        double weightKg = 5;

        System.out.println("Distance in miles: " +
                UnitConverter.kmToMiles(distanceKm));

        System.out.println("Weight in lbs: " +
                UnitConverter.kgToLbs(weightKg));
    }
}
