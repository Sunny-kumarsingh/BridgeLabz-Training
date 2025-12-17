import java.util.*;

// Program Name Basic Calculator

public class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		//Take input from the user
		System.out.println ("Enter the number1");
		int number1 = sc.nextInt();
		System.out.println ("Enter the number2");
		int number2 = sc.nextInt();
		
		// performing arithmethic Operations
		int add = number1 + number2;
		int sub = number1 - number2;
		int mul = number1 * number2;
		int div = number1/number2;
		
		//print Output
		System.out.println("Ther addition, subtraction, multiplication and division value of 2 numbers " + number1 +" and "+ number2 + " is " + add + "," + sub + "," + mul + "," + " and " + div);
	}
}