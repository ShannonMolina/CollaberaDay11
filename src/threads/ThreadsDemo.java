package threads;

public class ThreadsDemo {
	// main method represents the main thread
	public static void main(String[] args) {
		// everything here executed by the main thread
		
		// task1
		System.out.println("App started");
		
/*
		// task2 Version 1 - Sequential Run
		// if task2 is a long running operation
		// OS/JM will give a message that app is not responding
		// solution: need a new thread (child thread or Worker thread)
		MyTask task2 = new MyTask();
		task2.executeTask();
*/		
		
		
		// task2 Version 2 -
		// Run in a new thread (extending Thread class)
		MyTask task2 = new MyTask();
		task2.start(); // will call run()method

		
/*		
		// task2 Version 3 - Run in a new thread implementing Runnable interface
		Runnable r = new MyTask();
		Thread task2 = new Thread(r);
		task2.start();
*/		
		
		//task3 - print documents
		for(int doc=1; doc<=10; doc++) {
			System.out.println("* Printing document #" +doc+ " - Printer 1");
		}
		
		
		//task4
		System.out.println("App finished");
		
	}

}
