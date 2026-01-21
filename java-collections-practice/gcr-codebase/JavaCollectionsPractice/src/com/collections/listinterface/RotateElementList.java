package com.collections.listinterface;
import java.util.*;

public class RotateElementList {
	
	public static List<Integer> rotateList(List<Integer> list, int k){
		int n = list.size();
		k = k%n;
		List<Integer>result = new ArrayList<>();
		
		for(int i =k; i<n; i++) {
			result.add(list.get(i));
		}
		
		for(int i=0; i<k; i++) {
			result.add(list.get(i));
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		List<Integer>list =  Arrays.asList(10,20,30,40,50);
		int rotateIndex = 2;
		
		List<Integer>rotatedList = rotateList(list,rotateIndex);
		System.out.println(rotatedList);
		
		
	}
	

}
