import java.util.Scanner;

public class LowerCaseComparison{

    /string to lowercase using charAt() and ASCII logic
    public static String convertToLowerCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result = result + ch;
        }

        return result;
    }

    //strings using charAt()
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

        System.out.println("Enter the complete text:");
        String text = sc.nextLine();

			//lowercase conversion
        String customLower = convertToLowerCase(text);

			//lowercase conversion
        String builtInLower = text.toLowerCase();

        // Compare both strings
        boolean isSame = compareStrings(customLower, builtInLower);

        // Display results
        System.out.println("in Lowercase : " + customLower);
        System.out.println("in - built Lowercase     : " + builtInLower);
        System.out.println("both strings are same : " + isSame);
    }
}
