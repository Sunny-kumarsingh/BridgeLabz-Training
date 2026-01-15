package com.hospitalqueue;

public class HospitalQueue {
	
	public static void sortByCriticality(Patient[] patients, int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				
				if(patients[j].criticality < patients[j + 1].criticality) {
					Patient temp = patients[j];
					patients[j] = patients[j+1];
					patients[j + 1] = temp;
				}
			}
		}
	}
	
	public static void printPatients(Patient[] patients, int n) {
		
		for(int i=0; i<n; i++) {
			 System.out.println(
		                patients[i].name + " and Criticality: " + patients[i].criticality
		     );
		}
	}

}
