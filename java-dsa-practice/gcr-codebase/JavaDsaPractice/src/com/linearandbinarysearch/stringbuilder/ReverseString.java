package com.linearandbinarysearch.stringbuilder;
import java.util.*;

public class ReverseString {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		sb.append(sc.next());
		
		sb.reverse();
		System.out.println("Reverse String is :- ");
		System.out.println(sb.toString());
	}

}
