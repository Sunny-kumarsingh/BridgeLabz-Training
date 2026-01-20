package com.gamerzone;
public class QuickSort {

    public static void sort(Player[] arr, int low, int high) {

        if (low < high) {
            int pIdx = partition(arr, low, high);

            sort(arr, low, pIdx- 1);
            sort(arr, pIdx + 1, high);
        }
    }

    private static int partition(Player[] arr, int low, int high) {

        Player pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getScore() > pivot.getScore()) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(Player[] arr, int i, int j) {
        Player temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
