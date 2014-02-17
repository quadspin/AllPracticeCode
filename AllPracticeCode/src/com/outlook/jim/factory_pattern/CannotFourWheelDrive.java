package com.outlook.jim.factory_pattern;

public class CannotFourWheelDrive implements FourWheelDrivable {

	@Override
	public String fourWheelDrive() {
		String ability = "Cannot four wheel drive";
		return ability;
	}

}
