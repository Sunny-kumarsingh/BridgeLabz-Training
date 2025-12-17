import java.util.*;

public class HeightConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        double totalInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12);      // 1 foot = 12 inches
        double inches = totalInches % 12;

        // Print output
        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet +
                " and inches is " + inches);


    }
}
