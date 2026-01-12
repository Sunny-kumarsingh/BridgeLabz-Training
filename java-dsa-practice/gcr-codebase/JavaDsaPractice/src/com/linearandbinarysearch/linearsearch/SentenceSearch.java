package com.linearandbinarysearch.linearsearch;
public class SentenceSearch {

    public static String findSentence(String[] sentences, String word) {

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                return sentences[i]; 
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a powerful language",
            "Learning data structures is important",
            "Linear search is simple and effective",
            "Practice makes a developer perfect"
        };

        String word = "search";

        String result = findSentence(sentences, word);

        System.out.println("Result: " + result);
    }
}
