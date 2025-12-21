import java.util.Scanner;

public class NaturalNumberSum {

    // Method to find sum using Recursion
    public static int sumRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumRecursive(n - 1);
    }

    // Method to find sum using Formula: n * (n + 1) / 2
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //Check if it's a Natural Number (n > 0)
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            //Compute using both methods
            int recursiveResult = sumRecursive(n);
            int formulaResult = sumFormula(n);

            //  Compare and display results
            System.out.println("Sum using Recursion: " + recursiveResult);
            System.out.println("Sum using Formula:   " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both results match!");
            } else {
                System.out.println("The results do not match.");
            }
        }
        
        sc.close();
    }
}