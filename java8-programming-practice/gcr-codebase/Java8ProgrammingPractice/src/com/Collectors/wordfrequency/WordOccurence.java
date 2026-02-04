package com.Collectors.wordfrequency;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurence {
	public static void main(String args[]) {
		String paragraph = "java is fast and java is powerful";
		
		Map<String, Long> newMap = Arrays.stream(paragraph.split("\\s+"))
				.collect(Collectors.toMap(s -> s, s->1L, Long::sum ));

		System.out.println(newMap);
	}
}
