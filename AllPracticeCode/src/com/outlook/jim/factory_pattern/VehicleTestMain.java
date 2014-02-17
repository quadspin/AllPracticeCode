package com.outlook.jim.factory_pattern;

import java.util.Scanner;

public class VehicleTestMain {

	public static void main(String[] args) {

		VehicleFactory vehicleFactory = new VehicleFactory();

		Vehicle vehicle1 = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter car to create (F / H): ");
		
		if(userInput.hasNextLine()){
			String vehicleType = userInput.nextLine();
			
			vehicle1 = vehicleFactory.makeVehicle(vehicleType);
		}
		
		userInput.close();

		if(null != vehicle1){
			System.out.println("Name: " + vehicle1.getName());
			System.out.println("Color: " + vehicle1.getColor());
			System.out.println("Year: " + vehicle1.getYear());
			System.out.println("Calling four wheel drive mode:");
			System.out.println(vehicle1.putInFourWheelDrive());
			vehicle1.setFourWheelDriveType(new CannotFourWheelDrive());
			System.out.println("Changed ability, to not have four wheel drive");
			System.out.println("Calling four wheel drive mode:");
			System.out.println(vehicle1.putInFourWheelDrive());
		}else{
			System.out.println("Enter F or H for valid input");
		}
	}

}
