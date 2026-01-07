package com.sorts.countingsort;
import java.util.Scanner;

public class CountingSortStudentAges {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        // Input array
        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        // Counting Sort
        countingSort(ages, n);

        // Output
        System.out.println("Sorted Student Ages (Ascending Order):");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        sc.close();
    }

    static void countingSort(int[] arr, int n) {

        int min = 10;
        int max = 18;
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[n];

        // Store frequency
        for (int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }

        // Cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build output array
        for (int i = n - 1; i >= 0; i--) {
            int age = arr[i];
            output[count[age - min] - 1] = age;
            count[age - min]--;
        }

        // Copy output to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}