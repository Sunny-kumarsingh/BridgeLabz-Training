import java.util.Scanner;

// check a person can vote or not

public class CanVote{
	public static void main(String args[]){
		
		//Create a Scanner Object 
		Scanner s = new Scanner(System.in);
		
		//Get input value for number 
		System.out.print("Enter the age of the person : ");
		int age = s.nextInt();
		
		//check for the natural number
		if(age>=18){
			System.out.println("The person's age is " + age + " and can vote.");
		}
		else{
			System.out.println("The person's age is " + age + " and cannot vote.");
		}
		
	}
}