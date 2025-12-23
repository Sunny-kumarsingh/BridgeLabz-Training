import java.util.Scanner;

public class SplitTextWithoutSplit {

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

        // Count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
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

    // Method to compare two string arrays using charAt()
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (findLength(arr1[i]) != findLength(arr2[i]))
                return false;

            for (int j = 0; j < findLength(arr1[i]); j++) {
                if (arr1[i].charAt(j) != arr2[i].charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        //split
        String[] customResult = customSplit(text);

        // Built-in split
        String[] builtInResult = text.split(" ");

        // Compare
        boolean result = compareArrays(customResult, builtInResult);

        // Display custom split
        System.out.println("\nCustom Split Result:");
        for (String word : customResult) {
            System.out.println(word);
        }

        // Display built-in split
        System.out.println("\nBuilt-in split() Result:");
        for (String word : builtInResult) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}
