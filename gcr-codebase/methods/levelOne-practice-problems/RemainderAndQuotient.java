import java.util.*;


public class RemainderAndQuotient{
		
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int[] arr = new int[2];
		
		
		arr[0] =  number%divisor;
		arr[1] = number/divisor;
		return arr;
	}	
		

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
	
		//take input
		System.out.println("Enter the  2 number respectively :");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		
		int[] resultArr = new int [2];
		resultArr = findRemainderAndQuotient(n1,n2);
		
		// print output
		System.out.println("Remainder and Quotient number are respectively :  ");
		for(int i=0; i<2; i++){
			System.out.print(resultArr[i] +" ");
		}
	}
}