package com.runtimeanalysis;
import java.util.Scanner;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Fill array with sorted data
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Linear Search timing
        long startLinear = System.nanoTime();
        int linearIndex = linearSearch(arr, target);
        long endLinear = System.nanoTime();

        long linearTime = endLinear - startLinear;

        // Binary Search timing 
        long startBinary = System.nanoTime();
        int binaryIndex = binarySearch(arr, target);
        long endBinary = System.nanoTime();

        long binaryTime = endBinary - startBinary;

        // Output results
        System.out.println("\n--- Search Results ---");
        System.out.println("Linear Search Index: " + linearIndex);
        System.out.println("Linear Search Time: " + linearTime + " ns");

        System.out.println("Binary Search Index: " + binaryIndex);
        System.out.println("Binary Search Time: " + binaryTime + " ns");
        sc.close();
    }
}