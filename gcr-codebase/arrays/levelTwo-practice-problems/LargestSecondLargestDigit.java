import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Take input
        System.out.println("Enter a number:");
        int number = s.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        // Store digits in array
        while (number != 0) {
            if (index == maxDigit) {
                break; 
            }

            digits[index] = number % 10;
            number = number / 10; 
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        //result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
