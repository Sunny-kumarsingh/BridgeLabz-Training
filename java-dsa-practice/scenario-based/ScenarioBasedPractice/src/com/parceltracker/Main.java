package com.parceltracker;
public class Main {

    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        tracker.trackParcel();

        // Add custom checkpoint
        tracker.addCheckpoint("Shipped", "Custom Clearance");
        tracker.trackParcel();

        // Lost parcel case
        ParcelTracker lostParcel = new ParcelTracker();
        lostParcel.trackParcel();
    }
}
