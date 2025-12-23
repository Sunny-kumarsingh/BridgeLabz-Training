import java.util.Scanner;

public class ShortestAndLongestWord {

    // string length without using length()
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

    // text words without split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 1;

        // Count words
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

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start, length);

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Method to find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] data) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int currentLength = Integer.parseInt(data[i][1]);
            int minLength = Integer.parseInt(data[minIndex][1]);
            int maxLength = Integer.parseInt(data[maxIndex][1]);

            if (currentLength < minLength) {
                minIndex = i;
            }
            if (currentLength > maxLength) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Split text
        String[] words = customSplit(text);

        // Create 2D array
        String[][] wordLength = createWordLengthArray(words);

        // Find shortest and longest
        int[] resultIndex = findShortestAndLongest(wordLength);

        // Display table
        System.out.println("\nWord\t\tLength");
        for (int i = 0; i < wordLength.length; i++) {
            System.out.println(
                wordLength[i][0] + "\t\t" +
                Integer.parseInt(wordLength[i][1])
            );
        }

        // Display results
        System.out.println("\nShortest Word: " +
                wordLength[resultIndex[0]][0]);

        System.out.println("Longest Word: " +
                wordLength[resultIndex[1]][0]);

        sc.close();
    }
}
