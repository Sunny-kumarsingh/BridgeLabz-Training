import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {
		//Create Scanner object
        Scanner s = new Scanner(System.in);

		//take input
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("enter a positive integer.");
        } else {
			//loop 1 to number
            int i = 1;
            while (i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        s.close();
    }
}
