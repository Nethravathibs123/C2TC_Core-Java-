package com.cg.multipleinheritanceusinginterface;
interface Bike{
	void getmodel();
}
interface car{
	void getmodel();
}
public class Multipleinheritance implements Bike,car//parent class(Bike,car) interface child class(Multipleinheitance)
{

	public static void main(String[] args) {
		Multipleinheritance mi=new Multipleinheritance();//object creation for child class
		mi.getmodel();
		
	}
@Override//method of overriding
public void getmodel() {
	System.out.println("the model is recent");
}
	
		
	}


