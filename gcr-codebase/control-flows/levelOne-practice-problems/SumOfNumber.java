import java.util.*;

public class SumOfNumber{
	public static void main(String args[]){
		//Creating object
        Scanner s = new Scanner(System.in);
		
		//take input
        System.out.println("Enter number : ");
        int number = s.nextInt();

		int total =0;
		//count the counter
        while (number != 0) {
            total = total + number;
			System.out.println("Enter Zero to stop the loop");
			System.out.println("Enter number : ");
			number = s.nextInt();
       
		}
		System.out.println(total);

        s.close();
	}
}