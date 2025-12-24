import java.util.Scanner;

public class LongestWord {

    // Method to find the longest word using charAt()
    public static String findLongestWord(String sentence) {
        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                currentWord = currentWord + ch;
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }

        // Check last word
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String result = findLongestWord(sentence);
        System.out.println("Longest word: " + result);

        sc.close();
    }
}
