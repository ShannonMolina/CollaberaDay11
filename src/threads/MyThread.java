package threads;

public class MyThread extends Thread{
	Printer pRef;
	
	MyThread(Printer p){
		pRef =p;
	}
	
	@Override
	public void run() {
		synchronized(pRef) { // lock - no other thread can access pRef while this one is running
			pRef.printDocuments(10, "JohnsResume.pdf");
		}
	}
}
