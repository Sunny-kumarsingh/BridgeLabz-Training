import java.util.*;


public class HandShakes{
		
	public static int getHandShakes(int n){
		int totalHandShakes = (n*(n-1))/2;
		
		return totalHandShakes;
	}	

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the number of Student :");
		int numberOfSutdent = s.nextInt();
		int totalHandShakes = getHandShakes(numberOfSutdent);
		
		System.out.println("The total possible handShake : " +totalHandShakes);
	}
}