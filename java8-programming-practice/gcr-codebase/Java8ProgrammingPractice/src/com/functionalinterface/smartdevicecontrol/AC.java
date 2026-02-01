package com.functionalinterface.smartdevicecontrol;

public class AC implements Action {
	
		
		@Override
		public void turnOn() {
			System.out.println("AC is turn on ");
		}
		
		@Override
		public void turnOff() {
			System.out.println("AC is tuurn off ");
		}
}
