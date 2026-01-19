package com.runtimeanalysis;
import java.util.Random;
import java.util.Scanner;

public class SortingComparison {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        // Generate random data
        for (int i = 0; i < n; i++) {
            int val = rand.nextInt(n);
            arr1[i] = val;
            arr2[i] = val;
            arr3[i] = val;
        }

        // Bubble Sort timing skip if very large
        if (n <= 10000) {
            long startBubble = System.nanoTime();
            bubbleSort(arr1);
            long endBubble = System.nanoTime();
            System.out.println("Bubble Sort Time: " + (endBubble - startBubble) / 1_000_000 + " ms");
        } else {
            System.out.println("Bubble Sort Time: Unfeasible for large dataset");
        }

        // Merge Sort timing
        long startMerge = System.nanoTime();
        mergeSort(arr2, 0, n - 1);
        long endMerge = System.nanoTime();
        System.out.println("Merge Sort Time: " + (endMerge - startMerge) / 1_000_000 + " ms");

        // Quick Sort timing
        long startQuick = System.nanoTime();
        quickSort(arr3, 0, n - 1);
        long endQuick = System.nanoTime();
        System.out.println("Quick Sort Time: " + (endQuick - startQuick) / 1_000_000 + " ms");
        sc.close();
    }
}