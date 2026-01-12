package com.linearandbinarysearch.linearsearch;
public class FirstNegativeSearch {

    public static int findFirstNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // first negative found
            }
        }
        return -1; // no negative number found
    }

    public static void main(String[] args) {

        int[] numbers = {5, 10, 3, -4, 8, -2};

        int index = findFirstNegative(numbers);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found in the array");
        }
    }
}
