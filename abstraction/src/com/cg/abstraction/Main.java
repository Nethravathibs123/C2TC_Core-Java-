package com.cg.abstraction;
abstract class Mobike{
	abstract void run();
}
class pulsar extends Mobike{//inheritance by extending abstract class bike

	@Override
	void run() {
		System.out.println("the bike is running safely");
		
	}
	 
}
public class Main {//object creation

	public static void main(String[] args) {
   pulsar p=new pulsar();
	p.run();
	

	}

}

