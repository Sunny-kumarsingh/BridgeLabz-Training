import java.util.Scanner;

// rewrite the problem no. 8 using For-Loop

public class ForLoop {
    public static void main(String[] args) {
	
		//Creating object
        Scanner s = new Scanner(System.in);
		
		//take input
        System.out.print("Enter number to start countdown: ");
        int counter = s.nextInt();

		//count the counter
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
		
        s.close();
    }
}
