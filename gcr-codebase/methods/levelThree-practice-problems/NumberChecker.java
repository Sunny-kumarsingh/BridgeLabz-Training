import java.util.Scanner;

public class NumberChecker {

    // 1. Method to find the count of digits in a number
    public static int getDigitCount(int number) {
        if (number == 0) return 1;
        return String.valueOf(Math.abs(number)).length();
    }

    // 2. Method to store the digits of the number in an array
    public static int[] getDigitsArray(int number) {
        int count = getDigitCount(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    // 4. Method to check if the number is an Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return (int) sum == Math.abs(number);
    }

    // 5. Method to find largest and second largest elements
    public static void displayLargest(int[] digits) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        System.out.println("Largest: " + first + ", Second Largest: " + (second == Integer.MIN_VALUE ? "N/A" : second));
    }

    // 6. Method to find smallest and second smallest elements
    public static void displaySmallest(int[] digits) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        System.out.println("Smallest: " + first + ", Second Smallest: " + (second == Integer.MAX_VALUE ? "N/A" : second));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int[] digits = getDigitsArray(input);

        System.out.println("Digit Count: " + getDigitCount(input));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(input, digits));
        displayLargest(digits);
        displaySmallest(digits);

        sc.close();
    }
}