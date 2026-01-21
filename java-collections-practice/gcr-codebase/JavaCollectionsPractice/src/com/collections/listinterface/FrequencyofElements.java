package com.collections.listinterface;
import java.util.HashMap;

public class FrequencyofElements {
	public static void frequencyCount(String[] str) {
		HashMap<String, Integer>map = new HashMap<>();
		for(String n : str) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
			System.out.println(map);
	}
	
	public static void main(String args[]) {
		
		String[] input = {"apple", "banana", "apple", "orange"};
		frequencyCount(input);
	}
}
