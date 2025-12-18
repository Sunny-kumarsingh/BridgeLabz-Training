import java.util.Scanner;

// check if the which one is largest of the 3 numbers

public class largestOne{
	public static void main(String args[]){
		
		//Create a Scanner Object 
		Scanner s = new Scanner(System.in);
		
		//Get input value for number 
		System.out.println("Enter all three numbers : ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		boolean first = false;
		boolean second = false;
		boolean third = false;
		
		//check the input is for largest number
		if((n1>n2) && (n1>n3)){
			first = true;
		}
		else if((n2>n1) && (n2>n3)){
			second = true;
		}
		else{
				third = true;
			
		}
		
		//print output
		System.out.println("Is the first number the largest?"+ first );
		System.out.println("Is the Second number the largest?" + second );
		System.out.println("Is the third number the largest?"+ third );
		
	}
}