package com.collections.mapinterface;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\sunny\\Desktop\\Java programming workspace\\java-collections-practice\\gcr-codebase\\JavaCollectionsPractice\\src\\com\\collections\\mapinterface\\Hello.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                // ignore punctuation & case
                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.isEmpty()) continue;

                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
            br.close();

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(map);
    }
}
