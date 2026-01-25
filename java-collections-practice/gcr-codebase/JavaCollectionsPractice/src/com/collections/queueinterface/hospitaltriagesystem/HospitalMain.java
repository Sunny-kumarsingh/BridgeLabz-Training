package com.collections.queueinterface.hospitaltriagesystem;
import java.util.PriorityQueue;


public class HospitalMain {
	public static void main(String[] args) {
		PriorityQueue<Patient> pq =
                new PriorityQueue<>(new SeverityComparator());
		

        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        while (!pq.isEmpty()) {
            System.out.print(pq.poll().name + " ");
        }

	}
}
