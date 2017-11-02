package pkg2;
import pkg1.*;
public class C extends B{
	public C(int number_, String name_){
		super(number_, name_);
	}
	public void changeName(String new_name){
		callChangeName(new_name);
	}
}
