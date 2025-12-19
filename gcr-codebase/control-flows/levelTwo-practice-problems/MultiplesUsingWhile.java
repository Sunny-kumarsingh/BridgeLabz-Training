import java.util.Scanner;

public class MultiplesUsingWhile {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        // Check for positive integer and less than 100
        if (number > 0 && number < 100) {

            int counter = number - 1; 

            while (counter > 1) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }

        } else {
            System.out.println("Please enter a positive number less than 100");
        }

        s.close();
    }
}
