import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
		//create scanner object
        Scanner s = new Scanner(System.in);
		
		//take input
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        int greatestFactor = 1;

        // Check for positive integer
        if (number <= 1) {
            System.out.println("No greatest factor exists for this number.");
        } else {

            // Loop from number-1 to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

            System.out.println(
                "Greatest factor of " + number + " is: " + greatestFactor);
        }

        s.close();
    }
}
