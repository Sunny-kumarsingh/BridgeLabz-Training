import java.util.Scanner;

//check if a number is an Abundant Number.

public class AbundantNumber {
    public static void main(String[] args) {

		//Create Scanner object
        Scanner sc = new Scanner(System.in);

        //Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        //Find all divisors except the number itself
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        //Check Abundant condition
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }
    }
}
