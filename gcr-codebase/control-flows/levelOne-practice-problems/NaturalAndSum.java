import java.util.Scanner;

// check the natural number and write sum

public class NaturalAndSum{
	public static void main(String args[]){
		
		//Create a Scanner Object 
		Scanner s = new Scanner(System.in);
		
		//Get input value for number 
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		
		//check for the natural number
		if(n>=0){
			int sum  = (n*(n+1))/2;
			System.out.println("The sum of " + n + "natural numbers is "+ sum);
		}
		else{
			System.out.println("The number "+ n + "is not a natural number" );
		}
		
	}
}