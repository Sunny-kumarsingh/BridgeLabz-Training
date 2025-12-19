import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
		//create scanner object
        Scanner s = new Scanner(System.in);
		
		//take input
        System.out.print("Enter a number: ");
        int number = s.nextInt();
		System.out.println("Enter value of power");
		int power = s.nextInt();
		


		int result =1;
        for(int i=1; i<=power; i++) {
           result = result*number;		
        }
		System.out.println(result);
        

        s.close();
    }
}
