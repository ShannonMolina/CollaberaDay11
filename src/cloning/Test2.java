package cloning;

public class Test2 implements Cloneable{
	int a, b;
	
	Test C = new Test();
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Test2 test = null;
		
		// Assign the shallow copy to a new reference variable test
		test = (Test2)super.clone();
		
		// (Without this we only have a shallow copy)
		// Create a new object for the field C
		// and assign it to shallow copy obtained
		// to make it a deep copy
		test.C = new Test();
		test.C.x = C.x;
		test.C.y = C.y;


		
		return test;

	}
}
