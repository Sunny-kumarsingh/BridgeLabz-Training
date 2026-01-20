package com.foodfest;
public class FoodFestApp {

    public static void main(String[] args) {

        // Combined zone-wise sorted footfall data
        int[] footfall = {120, 200, 350, 100, 220, 300, 150, 250, 400};

        System.out.println("Before Sorting:");
        print(footfall);

        MergeSort.sort(footfall);

        System.out.println("After Sorting (Master List):");
        print(footfall);
    }

    private static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
