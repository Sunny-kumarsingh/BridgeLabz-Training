package com.flashdealz;

public class QuickSort {
	
	public static void quickSort(Product[] arr, int si, int ei) {
		if(si >= ei) {
			return;
		}
		int pIdx = partition(arr, si,ei);
		quickSort(arr, si, pIdx-1);
		quickSort(arr, pIdx+1, ei);
	}
	
	public static int partition(Product[]arr, int si, int ei) {
		int pivot =  arr[ei].discount;
		int i = si-1;
		
		for(int j=si; j<ei; j++) {
			if(arr[j].discount > pivot) {
				i++;
				Product temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		Product temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;
        return i + 1;
		
	}

}
