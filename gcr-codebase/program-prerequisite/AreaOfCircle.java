import java.util.*;

class AreaOfCircle{
	public static void main(String args[]){
	System.out.println("Enter the value of radius");
	Scanner sc = new Scanner (System.in);
	Double rad = sc.nextDouble();
	Double area = (rad*rad)*(22/7);
	System.out.println(area);	
}
	
}