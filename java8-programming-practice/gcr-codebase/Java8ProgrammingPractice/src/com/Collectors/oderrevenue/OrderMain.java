package com.Collectors.oderrevenue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderMain {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(   new Order("Rahul", 1200.50),
		        new Order("Amit", 800.00),
		        new Order("Rahul", 500.00),
		        new Order("Neha", 1500.75),
		        new Order("Amit", 200.25)
		); 
		
		Map<String, Double> revenueByCustomer= orders.stream()
				.collect(Collectors.groupingBy(Order::getCustomerName,
				Collectors.summingDouble(Order::getAmount)));
		
		System.out.println(revenueByCustomer);
	}

}
