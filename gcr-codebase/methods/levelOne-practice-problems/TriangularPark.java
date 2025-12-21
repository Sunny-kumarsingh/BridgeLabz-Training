import java.util.*;


public class TriangularPark{
		
	public static int getRound(int a, int b, int c ){
		int totalPerimeter = a+b+c;
		
		int totalRound = 5000/totalPerimeter;
		
		return totalRound;
	}	

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter the side of triangle one by one :");
		int s1  = s.nextInt();
		int s2  = s.nextInt();
		int s3  = s.nextInt();
		int totalRound = getRound(s1,s2,s3);
		
		System.out.println("The total Round : " + totalRound);
	}
}