package com.fleetmanager;
public class FleetManager {

    public static void main(String[] args) {

        // mileage data received from multiple depots (already sorted internally)
        int[] vehicleMileage = {12000, 18000, 25000, 30000, 15000, 22000, 28000};

        MergeSort ms = new MergeSort();
        ms.mergeSort(vehicleMileage, 0, vehicleMileage.length - 1);

        for (int mileage : vehicleMileage) {
            System.out.print(mileage + " ");
        }
    }
}
