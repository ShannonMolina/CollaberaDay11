package cloning;

public class TestApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Test2 test = new Test2();
		test.a = 4;
		test.b = 5;
		test.C.x = 6;
		test.C.y = 7;
		
		Test2 test2 = (Test2)test.clone();
		
		test2.a = 50;
		test2.C.x = 300;
		
		System.out.println(test.a + ", " + test.b + ", " + test.C.x +", " + test.C.y);
		System.out.println(test2.a + ", " + test2.b + ", " + test2.C.x + ", " + test2.C.y);
	}

}
