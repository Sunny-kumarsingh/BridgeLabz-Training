import java.util.Scanner;

public class TriangleAreaCmIn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input for base and height
        System.out.print("Enter base of triangle in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = input.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;
        // 1 inch = 2.54 cm → 1 sq inch = 2.54 * 2.54 sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Print output
        System.out.println("The Area of the triangle in sq in is " 
                + areaSqIn + " and sq cm is " + areaSqCm);

        input.close();
    }
}
