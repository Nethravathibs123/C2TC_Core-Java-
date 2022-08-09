package com.cg.abstraction;
abstract class bike{ 

	public bike()//constructor called
	{	System.out.println("bike is created");
	}
	abstract void run();//abstract method type
	public void changegear() {//non abstract method
		System.out.println("gear is changed");
	}
	}

class Honda extends bike{
	void run() {
		System.out.println("the bike is running safely");
	}
}
class Demo //
 {
	 public static void main(String args[]) {
Honda h=new Honda();//object creation for child class 
h.run();
h.changegear();
}}




