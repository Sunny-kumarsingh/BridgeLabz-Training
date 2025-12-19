import java.util.Scanner;
//check if a number taken from the user is a Harshad Number.


public class HarshadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int originalNumber = number;

        //Loop sum the digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + digit;
            originalNumber = originalNumber / 10;
        }

        // Checking for Harshad condition
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
    }
}
