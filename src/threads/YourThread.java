package threads;

public class YourThread extends Thread{
	Printer pRef;
	
	YourThread(Printer p){
		pRef =p;
	}
	
	@Override
	public void run() {
		synchronized(pRef) { // lock - no other thread can access pRef while this one is running
			pRef.printDocuments(10, "JimmysResume.pdf");
		}
	}
}
