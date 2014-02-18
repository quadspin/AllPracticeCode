package com.outlook.jim.simple_singleton;

public class SimpleSingleton {
	
	//this is a comment
	private static SimpleSingleton instance;
	
	private SimpleSingleton(){}
	
	public synchronized static SimpleSingleton getInstance(){
		if(instance == null){
			instance = new SimpleSingleton();
		}
		return instance;
	}

}
