public class UnitConvertor {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // This is the starting point of our program
    public static void main(String[] args) {
        //Converting 5 kilometers to miles
        double distanceKm = 5.0;
        double resultMiles = convertKmToMiles(distanceKm);
        
        System.out.println(distanceKm + " km is equal to " + resultMiles + " miles");
        
        // Converting 10 feet to meters
        double distanceFeet = 10.0;
        double resultMeters = convertFeetToMeters(distanceFeet);
        
        System.out.println(distanceFeet + " feet is equal to " + resultMeters + " meters");
    }
}