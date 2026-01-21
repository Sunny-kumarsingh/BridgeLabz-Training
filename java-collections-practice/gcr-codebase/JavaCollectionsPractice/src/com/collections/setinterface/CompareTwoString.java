package com.collections.setinterface;
import java.util.Set;
import java.util.HashSet;

public class CompareTwoString {
	
	public static void main(String arg[]) {
		Set<Integer>set1 = new HashSet<>();
		Set<Integer>set2 = new HashSet<>();
		
		// Add element in set1
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		// Add element in set2 
		set2.add(3);
		set2.add(2);
		set2.add(8);
		
		boolean isEqual = true;
		
		if(set1.size()!= set2.size()) {
			isEqual = false;
		}else {
			for(int i:set1) {
				if(!set2.contains(i)) {
					isEqual = false;
					break;
				}
			}
		}
		
		if(isEqual) {
			System.out.println("is string equals " + true);
		}
		else {
			System.out.println("is string equals " + false);
		}
		
	}

}
