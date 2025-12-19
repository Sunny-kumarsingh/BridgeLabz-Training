import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
		
		//Create Sacanner object
        Scanner s = new Scanner(System.in);
		
		//Take input
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        boolean isPrime = true;


		//check for prime
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
    }
}
