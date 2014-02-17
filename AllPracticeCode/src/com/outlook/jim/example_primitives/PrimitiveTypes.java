package com.outlook.jim.example_primitives;

import java.math.BigInteger;

public class PrimitiveTypes {

	static final double PInum = 3.1415927;

	//primitive types
	private byte biggestByte = 127; //min is -128
	private short biggestShort = 32_767; //min is -32768
	private int largestInt = 2_100_000_000; //max is 2.1 billion
	private BigInteger bInt = BigInteger.valueOf(5000);
	private long largestLong = 9_220_000_000_000_000_000L;
	private float largestFloat = 3.14F;
	private double largestDouble = 3.1482379872;
	private boolean trueOrFalse = true;

	private char randomChar = 65;
	private char anotherChar = 'A';
	private char escapedChars = '\f';  // \t \n \\ \" \'

	private String randomString = "I'm a random string";
	private String anotherString = "Stuff";
	private String andAnotherString = randomString + ' ' + anotherString;

	private String byteString = Byte.toString(biggestByte);
	private String shortString = Short.toString(biggestShort);
	private String intString = Integer.toString(largestInt);
	private String longString = Long.toString(largestLong);
	private String floatString = Float.toString(largestFloat);
	private String doubleString = Double.toString(largestDouble);

	public void doPrimitiveTypes() {

		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);		


		//parse methods will parse strings back into primitive number types
		//parseShort, parseLong, ParseByte, ParseFloat, ParseDouble, etc..
		int stringToInt = Integer.parseInt(intString);
		System.out.println(stringToInt);

		double aDoubleValue = 3457432.445;
		int doubleToInt = (int) aDoubleValue;

		System.out.println(doubleToInt);

		System.out.println(byteString);
		System.out.println(shortString);
		System.out.println(intString);
		System.out.println(longString);
		System.out.println(floatString);
		System.out.println(doubleString);
		System.out.println(randomChar);

		//math libraries
		int maxNumber = Math.max(7, 5);
		int randomNumber = (int) Math.random() * 11;  //random integer between 1 and 10

		/*Relational Operators
		 * Java has 6 relational operators
		 * > : greater than
		 * < : lesser than
		 * == : equal to
		 * != : not equal to
		 * >= : greater than or equal to
		 * <= : lesser than or equal to
		 */

		int value1 = 5;
		int value2 = 10;
		int result = (value1 < value2) ? value1 : value2;
	}
}
