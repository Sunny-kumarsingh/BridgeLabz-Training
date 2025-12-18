import java.util.*;


public class Factorial2{
	public static void main(String args[]){
	
		//Create Object
		Scanner s = new Scanner(System.in);
		
		// take intput
		 System.out.print("Enter number : ");
		int n = s.nextInt();
		
		
		int sum = 1;
		
		// calaculating factorial
		for(int i=1; i<=n; i++){
			sum = sum *i;
		}
		System.out.println(sum);
	}
}