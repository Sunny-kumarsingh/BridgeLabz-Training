package com.parkease;
public class ParkingManager {

    private String bookingLog = "";

    public void parkVehicle(ParkingSlot slot) {
        if (slot.isAvailable()) {
            slot.occupySlot();
            bookingLog += "Slot booked: " + slot.getSlotInfo() + "\n";
        }
    }

    public void unparkVehicle(ParkingSlot slot) {
        slot.freeSlot();
        bookingLog += "Slot freed: " + slot.getSlotInfo() + "\n";
    }

    public String getLogs() {
        return bookingLog;
    }
}
