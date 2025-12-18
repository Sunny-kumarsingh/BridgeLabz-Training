import java.util*;

public class QuotientAndReminder{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// taking input two number
		System.out.print("enter the num1 : ");
		int num1 = sc.nextInt();
		System.out.print("enter the num2 : ");
		int num2 = sc.nextInt();
		
		//find quotient and remainder
		int que = num1/num2;
		int rem = num1%num2;
		
		// print output
		System.out.println("The Quotient is "+ que +" and Reminder is " + rem + " of two number " + num1+ " and " + num2);
		
	}
}