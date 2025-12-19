import java.util.Scanner;

public class GreatestFactorUsingWhile {
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
           while((n-1)>1) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
				n--;
            }

            System.out.println(
                "Greatest factor of " + number + " is: " + greatestFactor);
        }

        s.close();
    }
}
