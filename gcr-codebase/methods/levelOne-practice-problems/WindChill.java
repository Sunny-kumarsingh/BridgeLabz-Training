import java.util.*;


public class WindChill{
		
	public static double calculateWindChill(double temperature, double windSpeed){
		
		double windChill = 35.+ 0.6215*temperature + (0.4275 * temperature - 35.75)*Math.pow(windSpeed, 0.16);
		
		return windChill;
	}	
		

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
	
		//take input
		System.out.println("Enter the temperature   : ");
		double n1 = s.nextDouble();
		System.out.println("Enter the windSpeed  : ");
		double n2 = s.nextDouble();
		
		
		
		
		// print output
		System.out.println("wind chill temperature is " + calculateWindChill(n1,n2));
		
	}
}