import java.util.Scanner;

public class NumberLogicScanner {

    // Method to check if positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if num1 > num2, 0 if equal, -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        //User Input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Loop and Check Logic
        System.out.println("\n--- Analysis ---");
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            
            if (isPositive(currentNum)) {
                if (isEven(currentNum)) {
                    System.out.println(currentNum + " is Positive and Even");
                } else {
                    System.out.println(currentNum + " is Positive and Odd");
                }
            } else {
                System.out.println(currentNum + " is Negative");
            }
        }

        //Compare First and Last Elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int comparisonResult = compare(first, last);


        if (comparisonResult == 1) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ")");
        } else if (comparisonResult == 0) {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ")");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ")");
        }

        sc.close();
    }
}