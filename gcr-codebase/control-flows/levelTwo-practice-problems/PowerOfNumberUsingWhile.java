import java.util.Scanner;

public class PowerOfNumberUsingWhile {
    public static void main(String[] args) {
		//create scanner object
        Scanner s = new Scanner(System.in);
		
		//take input
        System.out.print("Enter a number: ");
        int number = s.nextInt();
		System.out.println("Enter value of power");
		int power = s.nextInt();
		


		int result =1;
        int counter = 0;    // temp variable

        // while loop till counter == power
        while (counter < power) {
            result = result * number;
            counter++;
        }
		System.out.println(result);
        

        s.close();
    }
}
