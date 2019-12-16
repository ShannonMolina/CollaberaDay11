package threads;
/*
public class MyTask{
	//Sequential Run
	public void executeTask() {
		for(int doc=1; doc<=10; doc++) {
			System.out.println("* Printing document #" +doc+ " - Printer 1");
		}
	}
*/	
	

	//MyTask IS-A Thread
	//Version 2 - Run a new thread(extending Thread class)
public class MyTask extends Thread{	
	
	@Override
	public void run() {
		for(int doc=1; doc<=10; doc++) {
			System.out.println("* Printing document #" +doc+ " - Printer 2");
		}
	}
}
	
	
/*	
	//MyTask implements Runnable
   //Version 3 - Run in a new thread (implementing runnable interface)
   class OtherClass{
   }
   public class MyTask extends OtherClass implements Runnable{
   	@Override
		public void run() {
			for(int doc=1; doc<=10; doc++) {
				System.out.println("* Printing document #" +doc+ " - Printer 2");
			}
		}
	
	}*/
   
  
 
