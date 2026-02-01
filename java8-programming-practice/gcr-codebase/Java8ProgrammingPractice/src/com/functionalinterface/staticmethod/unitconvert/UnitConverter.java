package com.functionalinterface.staticmethod.unitconvert;
public interface UnitConverter {

    // km to miles
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // kg to pound
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}
