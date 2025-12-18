import java.util.*;


public class Factorial{
	public static void main(String args[]){
	
		//Create Object
		Scanner s = new Scanner(System.in);
		
		// take intput
		 System.out.print("Enter number : ");
		int n = s.nextInt();
		
		
		int sum = 1;
		
		// calaculating factorial
		while(n>0){
			sum = sum*n;
			n--;
			
		}
		System.out.println(sum);
	}
}