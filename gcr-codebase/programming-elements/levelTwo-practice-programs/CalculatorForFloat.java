import java.util.*;

// Program Name Basic Calculator for float value

public class CalculatorForFloat{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		//Take input from the user
		System.out.println ("Enter the number1");
		double number1 = sc.nextDouble();
		System.out.println ("Enter the number2");
		double number2 = sc.nextDouble();
		
		// performing arithmethic Operations
		double add = number1 + number2;
		double sub = number1 - number2;
		double mul = number1 * number2;
		double div = number1/number2;
		
		//print Output
		System.out.println("Ther addition, subtraction, multiplication and division value of 2 numbers " + number1 +" and "+ number2 + " is " + add + "," + sub + "," + mul + "," + " and " + div);
	}
}