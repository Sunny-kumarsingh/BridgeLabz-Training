package com.tailorshop;
public class TailorShopInsertionSort {

    public static void insertionSort(int[] deadlines) {
        int n = deadlines.length;

        for (int i = 1; i < n; i++) {
            int key = deadlines[i];
            int j = i - 1;

            // Shift larger deadlines to the right
            while (j >= 0 && deadlines[j] > key) {
                deadlines[j + 1] = deadlines[j];
                j--;
            }

            // Insert new order at correct position
            deadlines[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        // Deadlines of orders
        int[] orders = {2, 4, 6, 8, 5};

        insertionSort(orders);

        System.out.print("Sorted Orders by Deadline: ");
        for (int d : orders) {
            System.out.print(d + " ");
        }
    }
}
