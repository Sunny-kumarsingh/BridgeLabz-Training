import java.util.*;

//program for Sum of numbers

public class SumOfNumber{
	public static void main(String args[]){
		//Creating object
        Scanner s = new Scanner(System.in);
		
		//take input
        System.out.println("Enter number : ");
        Double number = s.nextDouble();

		int total =0;
		//count the counter
        while (number != 0) {
            total = total + number;
			System.out.println("Enter 0 to stop the loop");
			System.out.println("Enter number : ");
			number = s.nextDouble();
       
		}
		System.out.println(total);

        s.close();
	}
}