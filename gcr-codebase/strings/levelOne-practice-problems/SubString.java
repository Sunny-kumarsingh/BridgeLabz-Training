import java.util.Scanner;

public class SubString {

    // Create substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + str.charAt(i);
        }

        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the String: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using  method
        String subCharAt = createSubstringUsingCharAt(text, start, end);

        // Substring using in-built method
        String subBuiltIn = text.substring(start, end);

        // Compare both substrings
        boolean isSame = compareStringsUsingCharAt(subCharAt, subBuiltIn);

        // Display results
        System.out.println("\nSubstring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);
        System.out.println("Are both substrings equal? " + isSame);

        sc.close();
    }
}
