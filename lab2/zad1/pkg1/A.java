package pkg1;
import pkg2.*;
public class A{
	int number;
	protected String name;
	
	public A(int number_, String name_){
		number = number_;
		name = name_;
	}
	public void callDecrement(){
		this.decrement();
	}
	public void callChangeName(String new_name){
		this.changeName(new_name);
	}
	public void callIncrement(){
		this.increment();
	}
	private void increment(){
		++number;
	}
	protected void decrement(){
		--number;
	}
	void changeName(String new_name){
		name = new_name;
	}
	
	public int getNumber(){
		return number;
	}
}