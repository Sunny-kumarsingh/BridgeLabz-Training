package com.cropmonitor;

public class CropMonitorMain {
	public static void main(String args[]) {
		
		int[] sensorTimestamps = {17, 170, 18, 19, 16};;
		
		QuickSort.quickSort(sensorTimestamps, 0, sensorTimestamps.length-1);
		
		for(int t:sensorTimestamps ) {
			
			System.out.print(t + " ");
		}
	}

}
