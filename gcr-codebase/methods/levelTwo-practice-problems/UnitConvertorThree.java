public class UnitConvertorThree {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        // Formula: (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        // Formula: (C * 9/5) + 32
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        return fahrenheit;
    }

    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kg) {
        double kilograms2pounds = 2.20462;
        return kg * kilograms2pounds;
    }

    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Temperature
        System.out.println("98.6 Fahrenheit is " + convertFahrenheitToCelsius(98.6) + " Celsius");
        
        // Weight
        System.out.println("10 Pounds is " + convertPoundsToKilograms(10) + " Kilograms");
        
        // Volume
        System.out.println("5 Gallons is " + convertGallonsToLiters(5) + " Liters");
    }
}