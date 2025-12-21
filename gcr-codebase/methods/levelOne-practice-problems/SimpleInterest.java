import java.util.*;


public class SimpleInterest{
		
	public static int getSimpleInterest(int principal, int rate, int time){
		int si = (principal*rate*time)/100;
		return si;
	}	

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the principal, rate and time respectively : ");
		int p = s.nextInt();
		int r = s.nextInt();
		int t = s.nextInt();
		
		int storeValue = getSimpleInterest(p,r,t);
		System.out.println("Simple  Interest is : " + storeValue);
	}
}