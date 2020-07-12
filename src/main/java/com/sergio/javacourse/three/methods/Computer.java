package com.sergio.javacourse.three.methods;

/**
 * Create three methods for this object:
 * - a method named "turnOn" which prints in the screen "turning on...";
 * - a method named "turnOff" which prints in the screen "turning off...";
 * - a method named "openApp" which takes an input string field which prints in the screen "opening " + appName.
 *
 */
public class Computer {
	
	public void turnOn() {
		System.out.println("turning on...");
	}
	
	public void turnOff() {
		System.out.println("turning off...");
	}
	
	public void openApp(String appName) {
		System.out.println("opening " + appName);
	}

}
