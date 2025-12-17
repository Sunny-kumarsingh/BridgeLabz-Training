import java.util.Scanner;

// Perimeter of Square.

public class PerimeterOfSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Perimeter of square = 4 * side
        double side = perimeter / 4;

        // Print output
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);


    }
}
