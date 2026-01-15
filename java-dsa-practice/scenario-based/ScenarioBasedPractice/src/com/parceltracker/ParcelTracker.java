package com.parceltracker;
public class ParcelTracker {

    private Stage head;

    // Add stage at end
    public void addStage(String status) {
        Stage newStage = new Stage(status);

        if (head == null) {
            head = newStage;
            return;
        }

        Stage current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newStage;
    }

    // Add custom checkpoint after a given stage
    public void addCheckpoint(String afterStatus, String newStatus) {
        Stage current = head;

        while (current != null) {
            if (current.status.equals(afterStatus)) {
                Stage checkpoint = new Stage(newStatus);
                checkpoint.next = current.next;
                current.next = checkpoint;
                System.out.println("Checkpoint added: " + newStatus);
                return;
            }
            current = current.next;
        }

        System.out.println("Stage not found. Cannot add checkpoint.");
    }

    // Track parcel forward
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost! No tracking data.");
            return;
        }

        Stage current = head;
        System.out.print("Parcel Tracking: ");

        while (current != null) {
            System.out.print(current.status + " → ");
            current = current.next;
        }

        System.out.println("END");
    }
}
