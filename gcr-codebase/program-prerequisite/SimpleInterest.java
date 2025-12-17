import java.util.*;

class SimpleInterest{
	public static void main(String args[]){
		System.out.println("Enter principal, rate and time");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		int si = (p*r*t)/100;
		System.out.println(si);
	}
}