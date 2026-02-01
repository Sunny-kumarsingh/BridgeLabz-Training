package com.functionalinterface.smartdevicecontrol;

public class Tv implements Action {
	 @Override
	    public void turnOn() {
	        System.out.println("TV is turned ON");
	    }

	    @Override
	    public void turnOff() {
	        System.out.println("TV is turned OFF");
	    }
}
