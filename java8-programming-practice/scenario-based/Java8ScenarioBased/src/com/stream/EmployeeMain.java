package com.stream;

import java.util.Arrays;
import java.util.Comparator;
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
//		4. Get the details of highest paid employee in the organization ?
		Employee emp = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
		System.out.println(emp);
		
//		5. Get the names of all employees who have joined after 2015 ?
		List<String>nameList = employeeList.stream().filter(x -> x.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
		System.out.println(nameList);
		
//		6. Count the number of employees in each department ?
		Map<String, Long> map = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map);
		
//		7. What is the average salary of each department ?
		Map<String,Double>avgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);
		
//		8. Get the details of youngest male employee in the product development department ?
//		9. Who has the most working experience in the organization?
		
		Employee emp1 = employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).orElse(null);
		System.out.println(emp1);
		
//		10. How many male and female employees are there in the Sales team?
		Map<String, Long>map2 =	employeeList.stream().filter(x -> "IT".equals(x.getDepartment())).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map2);
		
//		11. What is the average salary of male and female employees ?
		Map<String, Double>map3 =	employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map3);
		
//		12. List down the names of all employees in each department ?
		 Map<String,List<String>>map4 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,  Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(map4);
//		13. What is the average salary and total salary of the whole organization?
		Double avgMap1 = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avgMap1);
		double totalSalary =
			    employeeList.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
		System.out.println(totalSalary);
	}

}
