import java.util.Scanner;

//check if a number is armstrong or not

public class ArmstrongNumber {
    public static void main(String[] args) {
		
		//Create Sacanner object
        Scanner s = new Scanner(System.in);
		
		//Take input
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        int sum =0;
		int originalNumber = number;


		//check for Armstrong Number
        while(originalNumber!=0){
			int reminder = originalNumber % 10;
			int cubeNumber = reminder*reminder*reminder;
			sum = sum+cubeNumber;
			originalNumber  = originalNumber/10;
			
		}

        if (sum == number) {
            System.out.println(number + " is a Armstrong Number");
        } else {
            System.out.println(number + " is not a Armstrong Number");
        }
    }
}
