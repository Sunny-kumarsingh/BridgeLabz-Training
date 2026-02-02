package com.methodreferences;
import java.util.*;
import java.util.stream.Collectors;

public class NameUpperCase {
	
	public static void main(String args[]) {
		List<String>lists = new ArrayList<>();
		lists.add("sunny");
		lists.add("ravi");
		lists.add("rohit");
		
		 // Convert names to uppercase
        List<String> upperNames = lists.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
		
		lists.forEach(System.out::println);
	}

}
