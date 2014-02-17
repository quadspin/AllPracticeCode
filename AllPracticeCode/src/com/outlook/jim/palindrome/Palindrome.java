package com.outlook.jim.palindrome;

public class Palindrome {
	
	public static void main(String[] args){
		CheckPalin();
	}
	
	public static void CheckPalin(){
		boolean bPalin = true;

		String sInput = "level";
		String sCandidate = sInput.toLowerCase();

		char cStart;
		char cEnd;

		int nStartPos = 0;
		int nEndPos = sCandidate.length() - 1;
		
		while(nStartPos < nEndPos){
//			String sStartLetter = sCandidate.substring(nStartPos, nStartPos + 1);
//			String sEndLetter = sCandidate.substring(nEndPos, nEndPos + 1);
			cStart = sCandidate.charAt(nStartPos);
			cEnd = sCandidate.charAt(nEndPos);
			
			if(cStart != cEnd){
				bPalin = false;
				break;
			}
//			if(sStartLetter.equalsIgnoreCase(sEndLetter) == false){
//				bPalin = false;
//				break;
//			}
			nStartPos++;
			nEndPos--;
		}
		
		if(bPalin)
			System.out.println(sCandidate + " is a palindrome");
		else
			System.out.println(sCandidate + " is not a palindrome");		
	}

}
