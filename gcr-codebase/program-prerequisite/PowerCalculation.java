import java.util.*;

class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter base and exponent");
        double b = sc.nextDouble();
        double e = sc.nextDouble();

        double result = Math.pow(b, e);

        System.out.println("Result: " + result);
    }
}
