import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
		crate Scanner Object
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = s.nextInt();

        // Check for natural number
        if (number > 0) {
		
			// Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        } 
		else {
            System.out.println("Please enter a valid natural number.");

        }
    }
}
