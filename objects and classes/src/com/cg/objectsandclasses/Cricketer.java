package com.cg.objectsandclasses;
class Cricketer {
String name="Dhoni";
	int age=39;
	String role="Brown";
	String nationality="Indian";
	void display()
	{
		System.out.println("I LOVE Cricket");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Cricketer c=new Cricketer();
		c.display();
		System.out.println("main method ended");
	}
	

}
		

