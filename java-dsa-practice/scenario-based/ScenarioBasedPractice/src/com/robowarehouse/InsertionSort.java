package com.robowarehouse;
public class InsertionSort {

    // Insertion Sort logic
    public void sort(int[] weights) {

        int n = weights.length;

        for (int i = 1; i < n; i++) {

            int key = weights[i];   // new package weight
            int j = i - 1;

            // shift heavier packages to the right
            while (j >= 0 && weights[j] > key) {
                weights[j + 1] = weights[j];
                j--;
            }

            // insert package at correct position
            weights[j + 1] = key;
        }
    }
}
