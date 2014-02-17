package com.outlook.jim.example_exceptions;

//import java.io.IOException;

// java.lang.RunTimeException;
// java.lang.Exception;

//types
// ArithmeticException
// ClassNotFoundException
// IllegalArgumentException
// IndexOutOfBoundsException
// InputMismatchException
// IOException

public class ExceptionExamples {

	public void divideByZero(int a) throws ArithmeticException, Exception {
		
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Some error occurred");
		}
		finally {
			System.out.println("This finally clause is always called, good for cleanup, closing databases, etc...");
		}
	}
	
	
	
}
