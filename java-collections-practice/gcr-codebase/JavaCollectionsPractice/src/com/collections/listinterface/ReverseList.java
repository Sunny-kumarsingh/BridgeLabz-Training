package com.collections.listinterface;
import java.util.ArrayList;
import java.util.Scanner;


public class ReverseList {
	public static void main (String args[]) {
		ArrayList<Integer>list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		ArrayList<Integer> reverse = new ArrayList<>();
		
		for(int i= list.size()-1; i>=0; i--) {
			reverse.add(list.get(i));
		}
		
		for(int e : reverse) {
			System.out.print(e + " ");
		}
	}

}
