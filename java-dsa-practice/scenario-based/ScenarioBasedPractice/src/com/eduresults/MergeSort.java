package com.eduresults;

public class MergeSort {
	public void sort(Student[] arr) {
		
		mergeSort(arr, 0,arr.length-1);
	}
	
	public static void mergeSort(Student[] arr, int si, int ei) {
	
		if(si>=ei) {
			return;
		}
		
		int mid = si +(ei-si)/2;
		mergeSort(arr, si, mid);
		mergeSort(arr, mid+1, ei);
		merge(arr, si, mid, ei);
		
	}
	
	private static void merge(Student arr[], int si, int mid, int ei) {
		Student[] temp = new Student[ei-si+1];
		int i = si;
		int j = mid+1;
		int k = 0;
		
		while(i <= mid && j<=ei) {
			if(arr[i].getMarks()> arr[j].getMarks()) {
				temp[k] = arr[i];
				i++;
			}
			else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		
		//left part remaining
		while(i<=mid) {
			temp[k++] = arr[i++];
		}
		
		while(j<=ei) {
			temp[k++] = arr[j++];
 		}
		
		for(k =0, i = si; k<temp.length; k++,i++) {
			arr[i] = temp[k];
		}
		
	}
}
