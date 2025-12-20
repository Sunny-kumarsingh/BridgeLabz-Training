import java.util.*;

public class CanVote{
	public static void main(String args[]){
		
		//create Scanner object
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		//taking input in array
		System.out.println("Enter the age of 10 student : ");
		for(int i=0; i<arr.length; i++){
			arr[i] = s.nextInt();
		}
		
		//checking for can student vote
		for(int i =0; i<arr.length; i++){
			if(arr[i]<0){
				System.out.println("Invalid age!");
			}
			else {
				if(arr[i]>=18){
					System.out.println("The student with the age "+ arr[i] +" can vote.");
				}
				else{
					System.out.println("The student with the age " + arr[i] + " cannot vote.");
				}
			}
		}
		
	}
}