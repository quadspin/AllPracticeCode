package com.outlook.jim.factorial;

public class FactMain {

	public static void main(String[] args) {
		Factorial FactorialInstance = new Factorial();
		int nInput = 2_199_222;
		float answer = FactorialInstance.factorial(nInput);
		System.out.println("factorial Answer " + answer);
		
//		answer = FactorialInstance.recurseFactorial(nInput);
//		System.out.println("recurseFactorial Answer " + answer);

	}

}
