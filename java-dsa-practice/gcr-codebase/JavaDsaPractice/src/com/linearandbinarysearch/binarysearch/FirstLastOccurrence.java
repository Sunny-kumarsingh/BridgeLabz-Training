package com.linearandbinarysearch.binarysearch;
public class FirstLastOccurrence {

    // Find first occurrence of target
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;       
                right = mid - 1;   
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Find last occurrence of target
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;  
                left = mid + 1;     
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7};
        int target = 4;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        if (first == -1) {
            System.out.println("Target not found: -1");
        } else {
            System.out.println("First Occurrence Index: " + first);
            System.out.println("Last Occurrence Index : " + last);
        }
    }
}
