package com.outlook.jim.test_concurrency;

public class Car implements Runnable {

	private String name;
	private int count = 0;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		drive();
	}

	public void drive() {
		count++;
		System.out.println("Car: " + name + " / count: " + count);
	}
}
