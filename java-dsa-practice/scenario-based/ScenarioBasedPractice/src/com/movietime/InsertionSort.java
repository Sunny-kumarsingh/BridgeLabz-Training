package com.movietime;
public class InsertionSort {

    public static void sort(int[] shows) {

        for (int i = 1; i < shows.length; i++) {
            int current = shows[i];
            int j = i - 1;

            while (j >= 0 && shows[j] > current) {
                shows[j + 1] = shows[j];
                j--;
            }

            shows[j + 1] = current;
        }
    }
}
