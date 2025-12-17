import java.util.Scanner;

public class FeetToYardMile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input 
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert feet to yards
        double yards = distanceInFeet / 3;

        // Convert yards to miles
        double miles = yards / 1760;

        // Output
        System.out.println("Distance in feet is " + distanceInFeet +
                " while in yards is " + yards +
                " and miles is " + miles);

        
    }
}
