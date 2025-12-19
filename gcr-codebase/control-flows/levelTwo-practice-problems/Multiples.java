import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
		//create scanner object
        Scanner s = new Scanner(System.in);
		
		//take input
        System.out.print("Enter a number: ");
        int number = s.nextInt();


        // Check for positive integer
        if ((number <= 1) || (number>100)) {
            System.out.println("Enter other number.");
        } else {
            // Loop from number-1 to 1
           for(int i=100; i>=1; i--) {
                if (number % i == 0) {
                   System.out.println(i);
                }
				
            }
        }

        s.close();
    }
}
