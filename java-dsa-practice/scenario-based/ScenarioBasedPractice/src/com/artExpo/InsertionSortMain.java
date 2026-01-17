package com.artExpo;
import java.util.ArrayList;

public class InsertionSortMain {

	public static void main(String args[]) {
		
		ArrayList<Integer>registratonTimes = new ArrayList<>();
	
		InsertionSort i = new InsertionSort();
		
		i.insertionSort(registratonTimes, 40);
        i.insertionSort(registratonTimes, 10);
        i.insertionSort(registratonTimes, 30);
        i.insertionSort(registratonTimes, 20);
		
		for(int t : registratonTimes) {
			System.out.print(t + " ");
		}
		
	}
}

