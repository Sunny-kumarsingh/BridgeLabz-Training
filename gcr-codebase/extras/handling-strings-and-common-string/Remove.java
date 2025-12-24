import java.util.Scanner;

public class Remove {

    //remove all occurrences of a character
    public static String removeChar(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        String output = removeChar(input, ch);
        System.out.println("Result after removal: " + output);

        sc.close();
    }
}
