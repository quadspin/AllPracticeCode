package com.outlook.jim.factory_pattern;

public abstract class Vehicle {

	private String name;
	private String color;
	private int year;

	public FourWheelDrivable FourWheelDriveType;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	public String putInFourWheelDrive(){
		return FourWheelDriveType.fourWheelDrive();
	}
	
	public void setFourWheelDriveType(FourWheelDrivable newFourWheelDrive){
		FourWheelDriveType = newFourWheelDrive;
	}
	
}
