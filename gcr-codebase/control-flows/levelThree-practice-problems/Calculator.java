import java.util.Scanner;

//create a calculator using switch...case.


public class Calculator {
    public static void main(String[] args) {
	
		//Create Scanner object
        Scanner sc = new Scanner(System.in);

        //take input values
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
		
		//take input for operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        //calculation using switch-case
        switch (op) {

            case "+":
                System.out.println("Result: " + (first + second));
                break;

            case "-":
                System.out.println("Result: " + (first - second));
                break;

            case "*":
                System.out.println("Result: " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
