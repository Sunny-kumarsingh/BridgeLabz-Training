import java.util.Scanner;

public class LexicographicalCompare {

    // Method to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {

        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                return c1 - c2;   // ASCII difference
            }
        }

        // If all characters matched till min length
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        int result = compareStrings(str1, str2);

        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else {
            System.out.println(str1 + " comes after " + str2);
        }

        sc.close();
    }
}
