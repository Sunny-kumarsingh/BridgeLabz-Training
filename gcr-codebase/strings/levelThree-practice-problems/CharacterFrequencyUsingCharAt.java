import java.util.Scanner;



public class CharacterFrequencyUsingCharAt {

    // Method to find frequency of characters and return 2D array
    public static String[][] findCharacterFrequency(String text) {

        int[] freq = new int[256]; 

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                count++;
                freq[ch] = -freq[ch];
            }
        }

        String[][] result = new String[count][2];
        int index = 0;

        // Store characters and their frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] < 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(-freq[ch]);
                freq[ch] = 0;
                index++;
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

        // Method call
        String[][] result = findCharacterFrequency(input);

        // Print result
        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
}
