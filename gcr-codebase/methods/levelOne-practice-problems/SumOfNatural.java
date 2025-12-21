import java.util.*;


public class SumOfNatural{
		
	public static int getSum(int n){
		int sum=0;
		for(int i=1; i<=n; i++){
			sum = sum + i;
		}
		return sum;
	}	

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the number  :");
		int number = s.nextInt();
		int totalSum = getSum(number);
		
		System.out.println("The total sum of "+ number + " natural number is :" + totalSum);
	}
}