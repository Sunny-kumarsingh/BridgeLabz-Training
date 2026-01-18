package com.fleetmanager;

public class MergeSort {
	
	public void mergeSort(int[] arr, int si, int ei) {
		int mid = si + (ei-si)/2;
		
		mergeSort(arr, si, mid-1);
		mergeSort(arr, mid+1, ei);
		
		 merge(arr, si, mid, ei);
	}
	
	public static void merge(int[] arr, int si, int mid, int ei) {
		int[] temp  = new int[ei-si+1];
		int i = si;
		int j = mid+1;
		int k =0;
		while(i<= mid && j<=ei) {
			if(arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			}
			else {
				temp[k++] = arr[j++];
			}
		}
		
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		
		while(j <= ei) {
			temp[k++] = arr[j++];
		}
		
		  for (k = 0, i = si; k < temp.length; k++, i++) {
	            arr[i] = temp[k];
	        }
	}

}
