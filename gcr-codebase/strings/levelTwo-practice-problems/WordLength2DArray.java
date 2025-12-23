import java.util.Scanner;

public class WordLength2DArray {

    // Method to find string length without length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 1;

        // Count number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }


        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }


        words[wordCount - 1] = text.substring(start, length);

        return words;
    }

    // create 2D array of word and length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; 
            result[i][1] = String.valueOf(findLength(words[i])); 
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        //split
        String[] words = customSplit(text);

        // Create 2D array
        String[][] wordLength = createWordLengthArray(words);

        // Display result in tabular format
        System.out.println("\nWord\t\tLength");


        for (int i = 0; i < wordLength.length; i++) {
            String word = wordLength[i][0];
            int length = Integer.parseInt(wordLength[i][1]); 
            System.out.println(word + "\t\t" + length);
        }

        sc.close();
    }
}
