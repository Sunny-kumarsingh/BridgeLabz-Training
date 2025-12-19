import java.util.Scanner;


//count the number of digits in an integer.


public class CountDigits {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // take input 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        //  Loop until number becomes 0
        while (number != 0) {
            number = number / 10;
            count++;
        }

        // result
        System.out.println("Number of digits: " + count);
    }
}
