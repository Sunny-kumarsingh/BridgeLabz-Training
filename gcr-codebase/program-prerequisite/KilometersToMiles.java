import java.util.*;
public class KilometersToMiles{
	public static void main(String args[]){
		System.out.println("Enter kilometers");
		Scanner sc = new Scanner (System.in);
		double k = sc.nextDouble();
		double miles = k*0.621371;
		System.out.println(miles);
	}

}