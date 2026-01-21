package com.collections.listinterface;
import java.util.*;


public class RemoveDuplicate {
	
	public static ArrayList<Integer> removeDuplicate(int[] arr){
		ArrayList<Integer>list = new ArrayList<>();
		for(int n: arr) {
			list.add(n);
		}
		
		ArrayList<Integer>result = new ArrayList<>();
		for(int n: list) {
			if(!result.contains(n)) {
				result.add(n);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,1,2,2,3,4};
		ArrayList<Integer>removedDup = removeDuplicate(arr);
		System.out.println(removedDup);
	}
}
