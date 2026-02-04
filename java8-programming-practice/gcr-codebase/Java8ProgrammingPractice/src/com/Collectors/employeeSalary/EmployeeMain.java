package com.Collectors.employeeSalary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
		        new Employee("Rahul", "IT", 60000),
		        new Employee("Amit", "HR", 40000),
		        new Employee("Priya", "IT", 70000),
		        new Employee("Neha", "HR", 50000),
		        new Employee("Suresh", "Finance", 80000)
		);
	
		Map<String, Double> avgSalaryByDept =
		        employees.stream()
		                 .collect(Collectors.groupingBy(
		                     Employee::getDepartment,                 // group by department
		                     Collectors.averagingDouble(
		                         Employee::getSalary                  // average salary
		                     )
		                 ));
	
		System.out.println(avgSalaryByDept);
	}
}

