import pkg1.*;
import pkg2.*;

class Main{
	public static void main(String [] argv){
		A a1 = new A(0,"piotr");
		
		
		a1.callDecrement();
		
		System.out.println(a1.getNumber());
		
		B b = new B(10,"bob");
		
		b.callDecrement();
		
		System.out.println(b.getNumber());
		
		C c = new C(20, "aaa");
		
		System.out.println(c.getNumber());
		
		c.changeName("ddd");


	}
}