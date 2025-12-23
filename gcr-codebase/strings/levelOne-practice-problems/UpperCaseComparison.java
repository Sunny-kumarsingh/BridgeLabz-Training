import java.util.Scanner;

public class UpperCaseComparison {

    //string to uppercase using charAt() and ASCII logic
    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result = result + ch;
        }

        return result;
    }

    //compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        //uppercase conversion
        String customUpper = convertToUpperCase(text);

        // Built-in uppercase methods
        String builtInUpper = text.toUpperCase();

        // Compare both strings
        boolean isSame = compareStrings(customUpper, builtInUpper);

        // Display results
        System.out.println(" in Uppercase : " + customUpper);
        System.out.println("in - Built Uppercase     : " + builtInUpper);
        System.out.println("both strings are same : " + isSame);
    }
}
