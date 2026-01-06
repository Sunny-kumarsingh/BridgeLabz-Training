package com.stack_and_queue;

import java.util.Scanner;

class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {
    	// extra petrol available
        int surplus = 0; 
        // total petrol shortage
        int deficit = 0;   
       // possible starting pump
        int start = 0;     

        for (int i = 0; i < petrol.length; i++) {
        	// calculate petrol balance
            surplus += petrol[i] - distance[i]; 
         // cannot start from current pump
            if (surplus < 0) {                  
                deficit += surplus;
                start = i + 1;                 
                surplus = 0;
            }
        }
       
        // check total feasibility 
        return (surplus + deficit >= 0) ? start : -1; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();

        int[] petrol = new int[n];
        int[] distance = new int[n];

        System.out.println("Enter petrol values:");
        for (int i = 0; i < n; i++)
            petrol[i] = sc.nextInt();

        System.out.println("Enter distance values:");
        for (int i = 0; i < n; i++)
            distance[i] = sc.nextInt();

        int startIndex = findStartingPoint(petrol, distance);
        System.out.println("Starting Pump Index: " + startIndex);
    }
}