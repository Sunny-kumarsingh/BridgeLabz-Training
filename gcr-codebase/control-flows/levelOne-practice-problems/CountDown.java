import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
	
		//Creating object
        Scanner s = new Scanner(System.in);
		
		//take input
        System.out.print("Enter number to start countdown: ");
        int counter = s.nextInt();

		count the counter
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        s.close();
    }
}
