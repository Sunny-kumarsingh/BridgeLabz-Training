import java.util.*;

public class AverageOfThreeNumber
{
	public static void main(String args){
	System.out.println("Enter three numbers ");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	int avg = (x+y+z)/3;
	System.out.println("Avg is : "avg);
}
 
}