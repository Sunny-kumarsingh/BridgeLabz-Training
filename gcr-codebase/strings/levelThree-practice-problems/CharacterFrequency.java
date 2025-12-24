import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters using nested loops
    public static String[] findCharacterFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Initialize frequency array
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
        }

        // Nested loops to find frequency
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Create 1D String array for result
        String[] result = new String[count * 2];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = String.valueOf(chars[i]);
                result[index++] = String.valueOf(freq[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Create object of Scanner
        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.println("Enter a string:");
        String input = sc.nextLine();
         
		// Call methods 
        String[] result = findCharacterFrequency(input);

        // print result
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < result.length; i += 2) {
            System.out.println(result[i] + " : " + result[i + 1]);
        }
    }
}
