import java.util.*;

public class CheckNumber{
	public static void main(String args[]){
		
		//create Scanner object
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		//taking input in array
		System.out.println("Enter the age of 5 number : ");
		for(int i=0; i<arr.length; i++){
			arr[i] = s.nextInt();
		}
		
		//checking for can student vote
		for(int i =0; i<arr.length; i++){
			if(arr[i]>0){
				if(arr[i]%2 == 0){
					//even
					System.out.println(arr[i]+" The number is even and positve");
				}
				else{
					System.out.println(arr[i]+" The number is odd and positve");
				}
			}
			else if(arr[i]<0){
				System.out.println(arr[i] +" is negative number");
			}
			else{
				System.out.println("The number zero");
			}
		}
		
	}
}