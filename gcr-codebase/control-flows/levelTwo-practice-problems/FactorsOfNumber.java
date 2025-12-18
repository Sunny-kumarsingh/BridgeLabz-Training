import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
		
		//Create Scanner object
        Scanner s = new Scanner(System.in);

		//take input
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            // Loop from 1 to less than number
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        s.close();
    }
}
