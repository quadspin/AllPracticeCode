package com.outlook.jim.reverse_string;

public class ReverseString {

	public ReverseString(){
	}
	
	public String reverseString(String sIn){

		String sReverse = new StringBuffer(sIn).reverse().toString();
		return sReverse;
	}
	
	public String revLoopStr(String sIn){
		int i = 0;
		int len = sIn.length();
		
		StringBuffer dest = new StringBuffer(len);
		
		for(i = (len -1); i >= 0; i--)
			dest.append(sIn.charAt(i));
		
		return dest.toString();
	}
}
