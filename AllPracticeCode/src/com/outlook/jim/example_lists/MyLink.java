package com.outlook.jim.example_lists;

public class MyLink {
	//myLink comment
	public String Bookname;
	public int millionsSold;
	
	public MyLink next;
	
	public MyLink(String Bookname, int millionsSold){
		this.Bookname = Bookname;
		this.millionsSold = millionsSold;
	}
	
	public void display(){
		System.out.println(Bookname + ": " + millionsSold + ",000,000s");
	}
	
	public String toString(){
		return Bookname;
	}

}
