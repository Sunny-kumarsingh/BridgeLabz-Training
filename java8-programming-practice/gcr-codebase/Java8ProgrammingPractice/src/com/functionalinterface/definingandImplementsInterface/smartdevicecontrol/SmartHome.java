package com.functionalinterface.smartdevicecontrol;
public class SmartHome {
    public static void main(String[] args) {

        Action light = new Light();
        Action ac = new AC();
        Action tv = new Tv();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
