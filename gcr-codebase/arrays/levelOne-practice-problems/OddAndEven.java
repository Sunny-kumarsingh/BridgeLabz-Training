import java.util.*;

public class OddAndEven{
	public static void main(String args[]){
		
		//create Scanner object
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = s.nextInt();
		int size = num/3;
		int[] even = new int[size];
		int[] odd = new int[size];
		
		int idxEven =0;
		int idxOdd = 0;
		
		
		if(num<0){
			System.out.println("error");	
			return;
		}	
		else{
			for(int i= 1; i<=num; i++){
				if(i%2==0){
					even[idxEven++] = i;
				}
				else{
					odd[idxOdd++] = i;
				}
			}
			
		}
		
		System.out.println("Even numbers are : ");
		for(int i=0; i<idxEven; i++){
			System.out.println(even[i]+ " ");
		}
		
		System.out.println("Odd numbers are : ");
		for(int i=0; i<idxOdd; i++){
			System.out.println(odd[i]+ " ");
		}
	}
}