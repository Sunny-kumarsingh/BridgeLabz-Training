package com.robowarehouse;
public class RoboWarehouse {

    public static void main(String[] args) {

        // package weights arriving one by one
        int[] packageWeights = {12, 5, 8, 3, 10};

        InsertionSort sorter = new InsertionSort();
        sorter.sort(packageWeights);

        System.out.println("Shelf Order (Ascending by Weight):");
        for (int weight : packageWeights) {
            System.out.print(weight + " ");
        }
    }
}
