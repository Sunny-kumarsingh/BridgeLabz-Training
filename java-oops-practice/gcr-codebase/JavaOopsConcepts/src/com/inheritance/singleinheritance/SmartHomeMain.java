package com.inheritance.singleinheritance;

public class SmartHomeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device d = new Thermostat("TH-101", true, 24);
        d.displayStatus();   // runtime polymorphism
	}

}
