import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input for base and height
        System.out.print("Enter base of triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle in inches: ");
        double height = input.nextDouble();
		
        double areaInInches = 0.5 * base * height;

        // Convert square inches to square centimeters
        // 1 inch = 2.54 cm → 1 sq inch = 2.54 * 2.54 sq cm
        double areaInCm = areaInInches * 2.54 * 2.54;

        // Print output
        System.out.println("The area of triangle in square inches is " 
                + areaInInches + 
                " and in square centimeters is " + areaInCm);

    }
}
