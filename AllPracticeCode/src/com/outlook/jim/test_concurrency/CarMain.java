package com.outlook.jim.test_concurrency;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car("Ford");
		
	      new Thread(car1).start();
	      new Thread(car1).start();
	      new Thread(car1).start();
		//addThreadsToPool();
	}

	public static void addThreadsToPool() {

		// ---schedule execution and execute repetitively based on time periods

		// ---make sure this is big enough to hold all threads
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(
				5);

		// ---add threads to the pool
		eventPool.scheduleAtFixedRate(new Car("Ford"), 0, 2, TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new Car("Nissan"), 10, 10,
				TimeUnit.SECONDS);
		eventPool.scheduleAtFixedRate(new Car("Toyota"), 10, 10,
				TimeUnit.SECONDS);

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
		}
		
		
		// ---find out how many threads we have running, we actually have 4
		// because Main is always running too
		// System.out.println("number of threads: " + Thread.activeCount());

		// --- make an Array of Threads
		// Thread[] listOfThreads = new Thread[Thread.activeCount()];

		// ---add all our Threads into our Array of Threads using
		// Thread.Enumerate
		// Thread.enumerate(listOfThreads);

		// ---show each Thread name
		// for (Thread i : listOfThreads) {
		// System.out.println(i.getName());
		// }
	}

}
