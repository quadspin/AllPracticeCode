package com.outlook.jim.calculate_pi;

public class CalculatePi {

	private double myPi = 4.0;

	private double j = 3.0;

	private double nLoop = 1_000;

	public void doPi() {

		// formula for calculating Pi
		// 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 ...

		while(j < nLoop) {
			myPi = myPi - (4 / j) + (4 / (j + 2));
			j += 4;  // add 4 to get to the next odd number in loop
			System.out.println(myPi);		
		}

		System.out.println("The real value of Pi = " + Math.PI);
	}	


}
