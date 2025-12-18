import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner s = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a natural number: ");
        int number = s.nextInt();

        // Check for natural number
        if (number > 0) {
			// Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        } else {
           System.out.println("Please enter a natural number greater than 0.");
        }

        s.close();
    }
}
