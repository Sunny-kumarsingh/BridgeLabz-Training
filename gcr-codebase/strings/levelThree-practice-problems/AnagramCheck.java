import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // Convert both texts to lowercase
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        // Check length equality
        if (text1.length() != text2.length()) {
            return false;
        }

        // Frequency array for ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Count frequency of characters in first text
        for (int i = 0; i < text1.length(); i++) {
            char ch = text1.charAt(i);
            freq1[ch]++;
        }

        // Count frequency of characters in second text
        for (int i = 0; i < text2.length(); i++) {
            char ch = text2.charAt(i);
            freq2[ch]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Create object of Scanner 
        Scanner sc = new Scanner(System.in);

        // Take input text 
        System.out.println("Enter first text:");
        String text1 = sc.nextLine();
        System.out.println("Enter second text:");
        String text2 = sc.nextLine();

        if (isAnagram(text1, text2)) {
            System.out.println("The given texts are Anagrams.");
        } else {
            System.out.println("The given texts are NOT Anagrams.");
        }
    }
}
