package com.homenest;
public abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;          
    protected double energyUsage; 

    // Firmware update log (secured)
    protected String firmwareLog;

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Registered successfully";
        System.out.println("? Device registered: " + deviceId);
    }

    // Encapsulation
    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Operator usage
    public double calculateEnergy(int hours) {
        return energyUsage * hours;
    }

    // Common behavior
    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(deviceId + " turned OFF");
    }

    // Polymorphic method
    @Override
    public abstract void reset();
}
