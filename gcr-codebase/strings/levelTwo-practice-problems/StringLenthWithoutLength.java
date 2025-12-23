import java.util.Scanner;

public class StringLengthWithoutLength {

    // method to find string length
    public static int findLength(String str) {
			int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // user-defined method
        int customLength = findLength(text);

        // Using built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}
