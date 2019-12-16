package threads;
import java.io.*;

// Java program to illustrate how to set the name
// of a thread at time of thread creation
// We can create thread by creating the 
// objects of that class
public class ThreadNaming extends Thread{
	ThreadNaming(String name){
		// call to constructor of the Thread class
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thread [" +getName()+ "] is running...");
	}
}
