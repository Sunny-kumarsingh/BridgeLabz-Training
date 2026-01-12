package com.linearandbinarysearch.binarysearch;
public class PeakElementSearch {

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

         
            boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            // If both conditions satisfied, mid is a peak
            if (leftOk && rightOk) {
                return mid;
            }

            // If left neighbor is greater, move left
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } 
            // Else move right
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int index = findPeakElement(arr);

        System.out.println("Peak element index: " + index);
        System.out.println("Peak element value: " + arr[index]);
    }
}
