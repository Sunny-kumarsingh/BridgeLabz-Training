package com.homenest;
public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId, 2.0);
    }

    @Override
    public void reset() {
        System.out.println("Thermostat reset: Temperature set to 24°C");
    }
}
