import java.util.Scanner;

// check if the first is smallest of the 3 numbers

public class FirstSmallest{
	public static void main(String args[]){
		
		//Create a Scanner Object 
		Scanner s = new Scanner(System.in);
		
		//Get input value for number 
		System.out.println("Enter the numbers : ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		//check the input is divisible by 5 or not
		if((n1<n2) && (n1<n2) && (n1<n3)){
			System.out.println("Is the first number the smallest? Yes" );
		}
		else{
			System.out.println("Is the numbers the smallest? No" );
		}
		
	}
}