import java.util.Scanner;

// check the number is whether  positive, negative, or zero

public class CheckNumber{
	public static void main(String args[]){
		
		//Create a Scanner Object 
		Scanner s = new Scanner(System.in);
		
		//Get input value for number 
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		
		//check for the number is positive , negative or zero
		if(n>0){
			System.out.println("Positive");
		}
		else if(n == 0){
			System.out.println("Zero");
		}
		else{
			System.out.println("Negetive");
		}
		
	}
}