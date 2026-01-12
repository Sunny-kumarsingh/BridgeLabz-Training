package com.homenest;
public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 1.5);
    }

    @Override
    public void reset() {
        System.out.println(" Camera reset: Recording restarted");
    }
}
