package com.outlook.jim.factory_pattern;

public class RoysHonda extends Vehicle{

	public RoysHonda(){
       setName("Civic");
       setColor("Blue");
       setYear(1977);
       FourWheelDriveType = new CannotFourWheelDrive();
	}
}
