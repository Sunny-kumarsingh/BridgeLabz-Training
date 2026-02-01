package com.functionalinterface.functionalInterfacesque;
import java.util.function.Predicate;
import java.util.Scanner;

public class TemperatureAlert {
	
	public static void main(String[] args) {
		Predicate<Double> tempAlert = x-> x<40;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature");
		
		double currTemp = sc.nextDouble();
		
		if(tempAlert.test(currTemp)) {
			System.out.println("Temperature is good ");
		}
		else {
			System.out.println("Alert !  Temperature is above the threshold");
		}
		
		sc.close();
	}

}
