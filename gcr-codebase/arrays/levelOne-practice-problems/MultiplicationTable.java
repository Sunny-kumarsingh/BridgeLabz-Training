import java.util.*;

public class MultiplicationTable{
	public static void main(String args[]){
		
		//create Scanner object
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		//take number for multiplication
		System.out.println("Enter the number for multiplication");
		int number = s.nextInt();
		
		//running loop from 0 to 10
		for(int i =0; i<arr.length; i++){
			arr[i] =  number*(i+1);
		}
		
		//print output
		for(int i = 0; i<arr.length; i++){
			
			System.out.println(number + " * " + (i+1) + " = " + arr[i]);
			
		}
		
	}
}