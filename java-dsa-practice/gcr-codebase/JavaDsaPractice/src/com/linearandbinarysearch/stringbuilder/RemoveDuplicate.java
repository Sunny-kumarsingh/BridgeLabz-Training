package com.linearandbinarysearch.stringbuilder;
import java.util.*;

public class RemoveDuplicate {
	
	public static String removeDuplicates(String input) {

        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
        String input = "Sunny";
        System.out.println("Original String: " + input);
        System.out.println("Without Duplicates: " + removeDuplicates(input));
    }
}
