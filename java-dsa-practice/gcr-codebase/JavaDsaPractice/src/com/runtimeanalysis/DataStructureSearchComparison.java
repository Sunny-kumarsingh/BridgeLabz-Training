package com.runtimeanalysis;
import java.util.*;

public class DataStructureSearchComparison {

    // Linear Search in Array
    public static boolean arraySearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Fill data structures
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Array Search timing
        long startArray = System.nanoTime();
        boolean arrayResult = arraySearch(arr, target);
        long endArray = System.nanoTime();

        // HashSet Search timing
        long startHash = System.nanoTime();
        boolean hashResult = hashSet.contains(target);
        long endHash = System.nanoTime();

        // TreeSet Search timing
        long startTree = System.nanoTime();
        boolean treeResult = treeSet.contains(target);
        long endTree = System.nanoTime();

        // Output results
        System.out.println("\n--- Search Results ---");
        System.out.println("Array Found: " + arrayResult);
        System.out.println("Array Search Time: " + (endArray - startArray) / 1_000_000 + " ms");

        System.out.println("\nHashSet Found: " + hashResult);
        System.out.println("HashSet Search Time: " + (endHash - startHash) + " ns");

        System.out.println("\nTreeSet Found: " + treeResult);
        System.out.println("TreeSet Search Time: " + (endTree - startTree) / 1_000_000 + " ms");
        sc.close();
    }
}