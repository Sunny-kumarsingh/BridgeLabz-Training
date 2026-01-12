package com.homenest;
public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId, 0.5);
    }

    @Override
    public void reset() {
        System.out.println(" Light reset: Brightness set to default");
    }
}
