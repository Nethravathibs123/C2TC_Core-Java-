package com.cg.interfacedemo;
interface Bike
{
	void getMileage();//abstract method 
}
class R15 implements Bike//R15 is child class inherited from bike i.e., parent lass
{
	public void getMileage()//abstract method called
	{
		System.out.println("Mileage is 40km/l");//print statement 
		
	}
}

public interface InterfaceExample {//main class
public static void main(String args[])
{
	R15 Bike=new R15();//object creation for child class
	Bike.getMileage();
	}
}
