package com.collections.listinterface;
import java.util.*;


public class ReverseListUsingLinkedList {
	
	 public static void reverseLinkedList(LinkedList<Integer> list) {

	        int left = 0;
	        int right = list.size() - 1;

	        while (left < right) {
	            Integer temp = list.get(left);
	            list.set(left, list.get(right));
	            list.set(right, temp);

	            left++;
	            right--;
	        }
	    }

	    public static void main(String[] args) {

	        LinkedList<Integer> list = new LinkedList<>(
	                Arrays.asList(1, 2, 3, 4, 5)
	        );

	        reverseLinkedList(list);
	        System.out.println(list);
	    }

}
