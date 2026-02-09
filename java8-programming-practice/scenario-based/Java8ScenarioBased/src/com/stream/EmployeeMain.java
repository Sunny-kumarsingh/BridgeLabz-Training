package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		
		List<Employee> employeeList = Arrays.asList(
				new Employee(1, "Amit", 30, "Male", "IT", 2018, 60000),
		        new Employee(2, "Neha", 28, "Female", "HR", 2019, 55000),
		        new Employee(3, "Rahul", 35, "Male", "Finance", 2015, 75000),
		        new Employee(4, "Pooja", 32, "Female", "IT", 2017, 65000),
		        new Employee(5, "Vikas", 40, "Male", "Admin", 2012, 80000),
		        new Employee(6, "Sneha", 26, "Female", "Marketing", 2021, 48000)
		); 
		
//		1. How many male and female employees are there in the organization 
		Map<String, Long> newMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(newMap);
		
//		2. Print the name of all departments in the organization.
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
//		3. What is the average age of male and female employees ?
		Map<String, Double> avgMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(avgMap);
		
		
	}

}
