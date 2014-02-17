package com.outlook.jim.example_lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class ListsExamples {

	public void LinkedListEx(){
		LinkedList<String> items = new LinkedList<String>();
	    items.add("one");
	    items.add("two");

	    System.out.println(items);
	    items.removeLast();
	    System.out.println(items);
	}
	
	
	public void walkList()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(22);
		list.add(19);
		list.add(99);
		
		Iterator<Integer> here = list.iterator();
		System.out.println(here.next());
		here.remove();
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Here");
		strList.add("we");
		strList.add("walk");
		strList.add("together");
		
		Iterator<String> strHere = strList.iterator();
		strHere.next();
		System.out.println(strHere.next()); //prints element preceding
		strHere.remove();
	}
	
}
