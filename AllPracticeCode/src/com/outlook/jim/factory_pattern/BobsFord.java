package com.outlook.jim.factory_pattern;

public class BobsFord extends Vehicle {

	public BobsFord(){
	       setName("Taurus");
	       setColor("Red");
	       setYear(1983);
	       FourWheelDriveType = new CanFourWheelDrive();
		}

}
