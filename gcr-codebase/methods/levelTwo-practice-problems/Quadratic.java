import java.util.Scanner;

public class Quadratic{

    public static double[] findRoots(double a, double b, double c) {
       
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{r1, r2};
        } else if (delta == 0) {
            double r = -b / (2 * a);
            return new double[]{r};
        } else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For the equation ax^2 + bx + c = 0, enter coefficients:");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        // Display results
        if (roots.length == 0) {
            System.out.println("The equation has no real roots (delta is negative).");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

        sc.close();
    }
}