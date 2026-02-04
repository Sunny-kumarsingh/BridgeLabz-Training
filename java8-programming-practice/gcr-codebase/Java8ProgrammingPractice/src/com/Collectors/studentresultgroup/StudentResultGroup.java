package com.Collectors.studentresultgroup;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentResultGroup {
	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("sunny", "A"),
				new Student("sunny", "A"),
				new Student("Rahul", "A"),
			    new Student("Amit", "B"),
			    new Student("Priya", "A"),
			    new Student("Neha", "C"),
			    new Student("Suresh", "B")
		);
		
		Map<String, List<String>> newlist = list.stream()
				.collect(Collectors.groupingBy(Student::getGrade, Collectors.mapping(Student::getName,Collectors.toList())));
		
		System.out.println(newlist);
	}
}
