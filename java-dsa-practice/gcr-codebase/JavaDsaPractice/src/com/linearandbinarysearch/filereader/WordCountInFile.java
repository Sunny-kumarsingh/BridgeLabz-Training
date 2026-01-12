package com.linearandbinarysearch.filereader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\sunny\\Desktop\\New folder (2)\\Hello.txt";
        String targetWord = "java";
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Split line into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Word '" + targetWord + "' appears " + count + " times.");
    }
}
