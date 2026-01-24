package com.collections.queueinterface;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseQueue {
	
	public static void reverseQueue(Queue<Integer>q) {
		if(q.isEmpty()) {
			return;
		}
		int front  = q.remove();
		reverseQueue(q);
		q.add(front);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Queue<Integer> q = new LinkedList<>();

	    System.out.print("Enter number of elements: ");
	    int n = sc.nextInt();

	    System.out.println("Enter elements:");
	    for (int i = 0; i < n; i++) {
	        q.add(sc.nextInt());
	    }
	    
	    reverseQueue(q);
	    
	    System.out.println(q);
	    
	    sc.close();    
		
	}

}
