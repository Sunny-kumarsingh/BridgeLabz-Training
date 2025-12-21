import java.util.*;


public class CheckNumber{
		
	public static int getCheckNumber(int n){
		if(n<0){
			System.out.println("Number is Negetive : ");
			return -1;
		}
		else if(n>0){
			System.out.println("Number is Positive : ");
			return 1;
		}
		else{
			System.out.println("Number is : ");
			return 0;
		}
	}	

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the number :");
		int number = s.nextInt();
		
		
		System.out.println(getCheckNumber(number));
	}
}