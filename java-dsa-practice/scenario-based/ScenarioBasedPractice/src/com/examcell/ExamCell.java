package com.examcell;
public class ExamCell {

    public static void main(String[] args) {

        // scores collected from multiple centers
        int[] scores = {78, 92, 65, 88, 70, 90, 60};

        MergeSort ms = new MergeSort();
        ms.mergeSort(scores, 0, scores.length - 1);

        System.out.println("State-Level Rank List (Sorted Scores):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
