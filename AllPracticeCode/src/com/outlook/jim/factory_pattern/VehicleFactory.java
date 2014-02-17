package com.outlook.jim.factory_pattern;

public class VehicleFactory {

	public Vehicle makeVehicle(String type){

		if(type.equalsIgnoreCase("H")){
			return new RoysHonda();
		}
		else
			if(type.equalsIgnoreCase("F")){
				return new BobsFord();
			}
			else return null;
	}
}
