package com.collections.listinterface;
import java.util.LinkedList;

public class RemoveElementLinkedlist {
	
	public static void main(String args[]) {
		
		LinkedList<Character>list = new LinkedList<>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		
		int idx = 2;
		list.remove(idx);
		System.out.println(list);
		
	}

}
