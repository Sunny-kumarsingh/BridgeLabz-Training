import java.util.Scanner;

public class Replace {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        String currentWord = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (currentWord.equals(oldWord)) {
                    result += newWord;
                } else {
                    result += currentWord;
                }
                result += " ";
                currentWord = "";
            }
        }

        // Check last word
        if (currentWord.equals(oldWord)) {
            result += newWord;
        } else {
            result += currentWord;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        String output = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated sentence:");
        System.out.println(output);

        sc.close();
    }
}
