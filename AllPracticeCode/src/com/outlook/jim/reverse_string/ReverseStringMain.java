package com.outlook.jim.reverse_string;

public class ReverseStringMain {

	public static void main(String[] args) {

		ReverseString revStr = new ReverseString();
		String answer = revStr.reverseString("abcdefg");
		System.out.println(answer);
		
		String answer2 = revStr.revLoopStr("abcdefg");
		System.out.println(answer2);
	}

}
