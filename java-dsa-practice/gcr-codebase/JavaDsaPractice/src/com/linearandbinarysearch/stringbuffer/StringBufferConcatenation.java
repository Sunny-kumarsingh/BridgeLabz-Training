package com.linearandbinarysearch.stringbuffer;
public class StringBufferConcatenation {

    public static String concatenateStrings(String[] arr) {

        StringBuffer buffer = new StringBuffer();

        for (String str : arr) {
            buffer.append(str);
        }

        return buffer.toString();
    }

    public static void main(String[] args) {

        String[] words = {"Java", " ", "is", " ", "powerful"};

        String result = concatenateStrings(words);

        System.out.println("Concatenated String: " + result);
    }
}
