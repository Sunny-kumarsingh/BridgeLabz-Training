import java.util.*;

public class MultiplicationTableSixToNine{
	public static void main(String args[]){
		
		//create Scanner object
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[4];
		
		//take number for multiplication
		System.out.println("Enter the number for multiplication");
		int number = s.nextInt();
		
		

		int j =0;
		for(int i=6; i<10; i++){
			arr[j++] = number * (i);
		}
		
		
		//print output
		int z=6;
		for(int i = 0; i<arr.length; i++){
			
			System.out.println(number + " * " + (z++) + " = " + arr[i]);
			
		}
		
	}
}