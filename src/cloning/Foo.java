package cloning;

public class Foo implements Cloneable{
	public int num;
	public int[] nums;
	
	@Override
	public Foo clone() {
		Foo fobj = null;
		try {
			fobj = (Foo)super.clone(); //copies fields//
			fobj.nums = nums.clone(); //arrays implement clone
			
		} catch (CloneNotSupportedException e) {}
		
		return fobj;
		
	}
}
