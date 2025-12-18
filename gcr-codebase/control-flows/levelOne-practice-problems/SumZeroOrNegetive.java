import java.util.Scanner;

//program to find the sum is negaive or not using while loop and break

public class SumZeroOrNegative {
    public static void main(String[] args) {
		
		//Create Obeject
        Scanner s = new Scanner(System.in);
		
		//take input
		System.out.print("Enter a number: ");
		int num = s.nextInt();
        int sum = 0;

        while (true) {
			System.out.println("Enter 0 to stop the while loop");
            System.out.print("Enter a number: ");
            int num = s.nextInt();

            // break condition
            if (num <= 0) {
                break;
            }

            sum = sum + num;
        }

        System.out.println("Sum of entered numbers = " + sum);
		s.close();
    }
}
