package com.outlook.jim.example_lists;

public class MyLinkList {
	
		public MyLink firstLink;
		
		public void MyLink(){
			firstLink = null;
		}
		
		public boolean isEmpty(){
			return(firstLink == null);
		}
}
