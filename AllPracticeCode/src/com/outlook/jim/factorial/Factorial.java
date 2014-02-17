package com.outlook.jim.factorial;
import java.math.BigInteger;


public class Factorial {

    // check input not negative
	// check input not too big
	// check input 0 then answer is 1
	
	public float factorial (int n)
	{
		if(n < 0){
			System.out.println("Input cannot be negative value");
			return 0;
		}
		
		float sum = 1;

		try{
			for(int x = n; x > 1; x--){
				sum *= x;
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Warning: number cannot be larger than " + Float.MAX_VALUE);
			sum = 0;
		}

		return sum;
	}

	
	public int recurseFactorial(int n)
	{
		if(n == 0)
			return 1;
		else
			return n * recurseFactorial(n-1);
	}
	
}
