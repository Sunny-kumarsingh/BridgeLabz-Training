import java.util.Scanner;

// check if a number is divisible by 5

public class Divisible{
	public static void main(String args[]){
		
		//Create a Scanner Object 
		Scanner s = new Scanner(System.in);
		
		//Get input value for number 
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		
		//check the input is divisible by 5 or not
		if((n%5)==0){
			System.out.println("Is the number "+ n + " divisible by 5? True" );
		}
		else{
			System.out.println("Is the number "+ n + " divisible by 5? False" );
		}
		
	}
}