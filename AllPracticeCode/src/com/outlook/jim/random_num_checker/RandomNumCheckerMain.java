package com.outlook.jim.random_num_checker;

import java.util.Scanner;

public class RandomNumCheckerMain {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {

		int nRandomGuess = 1;
		boolean bResult = false;
		RandomNumChecker rNumChecker = new RandomNumChecker();

		while(false == bResult)
		{
			System.out.print("Guess the random number (between 1 and 100) :");
			nRandomGuess = userInput.nextInt();
			bResult = rNumChecker.checkGuess(nRandomGuess);
		}

	}

}
