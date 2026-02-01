package com.functionalinterface.functionalInterfacesque;
import java.util.function.*;

public class StringLengthChecker {
	public static void main(String args[]) {
		
		Function<String, Integer> strLength = x -> x.length();
		Predicate<Integer>check = y-> y<10;
		
		String str = "sunny";
		if(check.test(strLength.apply(str))){
			System.out.println("String length is under limit");
		}else {
			System.out.println("String length is above the limit");
		}
	}
	

}
