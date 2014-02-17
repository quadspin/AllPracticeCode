package com.outlook.jim.random_num_checker;


public class RandomNumChecker {
	
	private static int nRandomNum = 5;
	private boolean bAnswer = false;
	
	public boolean checkGuess(int nGuess) {
		
		if(nGuess == nRandomNum) {
			System.out.println("You guessed correctly!");
			bAnswer = true;
		}
		
		return bAnswer;
	}
	
}
