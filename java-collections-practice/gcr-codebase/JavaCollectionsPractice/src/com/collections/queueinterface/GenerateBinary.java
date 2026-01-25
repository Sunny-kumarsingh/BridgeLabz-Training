package com.collections.queueinterface;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;



public class GenerateBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
		Queue<String> q = new LinkedList<>();
		

		String str = "" ;
		
		while(n>0) {
			int rem = n%2;
			str = rem + str;
			q.add(str);
			n = n/2;
		}
		
		System.out.println(q);
	}
}
