package com.examcell;
public class MergeSort {

    public void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // divide
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // merge
        merge(arr, si, mid, ei);
    }

    private void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];

        int i = si;        // left part pointer
        int j = mid + 1;   // right part pointer
        int k = 0;         // temp array pointer

        // merge two sorted parts
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // remaining left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // remaining right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
