import java.util.Scanner;

public class TrigCalculator {

    public static double[] calculateTrigonometricFunctions(double angle) {
		
		double[] triValue = new double[3];
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate values using Math class
        triValue[0] = Math.sin(radians);
        triValue[1] = Math.cos(radians);
        triValue[2] = Math.tan(radians);

        // Return as an array
        return triValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the angle in degrees: ");
        double angleDegrees = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angleDegrees);

        System.out.println("Sine:  " + results[0]);
        System.out.println("Cosine:" + results[1]);
        
        // Handle potential undefined tangent (e.g., 90 degrees)
        if (Math.abs(results[1]) < 1e-10) {
            System.out.println("Tangent: Undefined (Vertical Asymptote)");
        } else {
            System.out.println("Tangent: " + results[2]);
        }
        
        sc.close();
    }
}