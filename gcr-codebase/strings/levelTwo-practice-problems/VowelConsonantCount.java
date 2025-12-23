import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check character type
    public static String checkCharacter(char ch) {


        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check for a letter is vowels or consonants
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsAndConsonants(text);

        // Display result
        System.out.println("\nVowels Count      : " + result[0]);
        System.out.println("Consonants Count  : " + result[1]);

        sc.close();
    }
}
