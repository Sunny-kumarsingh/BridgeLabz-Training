import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = s.nextInt();

        // Print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        s.close();
    }
}
