package com.artExpo;
import java.util.ArrayList;

public class InsertionSort {
	
	public void insertionSort(ArrayList<Integer>time, int value) {
		int j = time.size()-1;
		time.add(value);
		
	
			// shift elements
			while(j >= 0 && time.get(j) > value){
				time.set(j+1, time.get(j));
				j--;
			}
			
			
			// insert at correct position
			time.set(j+1, value);
		}
	}

