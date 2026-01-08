package com.parkease;
public class ParkingSlot {

    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    protected void occupySlot() {
        isOccupied = true;
    }

    protected void freeSlot() {
        isOccupied = false;
    }

    public String getSlotInfo() {
        return slotId + " at " + location + " for " + vehicleTypeAllowed;
    }
}
