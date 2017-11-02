package pkg1;
import pkg2.*;

public class B extends A{
	public B(int number_, String name_){
		super(number_, name_);
	}
	
	protected void decrement(){
		--this.number;
		--this.number;
	}
	void changeName(String new_name){
		this.name = new_name;
	}
	private void increment(){
		++this.number;
		++this.number;
	}
	
}