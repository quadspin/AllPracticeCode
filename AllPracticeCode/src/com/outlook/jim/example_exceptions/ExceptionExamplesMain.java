package com.outlook.jim.example_exceptions;


public class ExceptionExamplesMain {

	public static void main(String[] args) {

		ExceptionExamples eExamples = new ExceptionExamples();
		
		try {
			eExamples.divideByZero(4);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}

}
