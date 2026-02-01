package com.functionalinterface.definingandImplementsInterface.smartdevicecontrol;

public class Light implements Action{
	@Override
	public void turnOn() {
		System.out.println("Light is turn on ");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Light is tuurn off ");
	}
}
