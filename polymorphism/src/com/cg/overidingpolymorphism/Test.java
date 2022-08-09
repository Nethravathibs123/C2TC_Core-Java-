package com.cg.overidingpolymorphism;

class Bank {//Parent class
	int getRateofinterest()//method 
	{
		return 0;
	}}
	class SBI extends Bank{//inherited from parent(bank) to child class(SBI)
		int getRateofinterest() {
			return 8;
		}
	}
	class ICICI extends Bank//inherited from parent(bank) to child class(ICICI)
	{
		int getRateofinterest()
		{
			return 7;
			}}
	class AXIS extends Bank{//inherited from parent(bank) to child class(AXIS)
		int getRateofinterest()
		{
			return 9;
		}}
		class Test {//main class
	public static void main(String args[]) {
		SBI s=new SBI();//object created for child class
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		System.out.println("SBI rate of interest: "+s.getRateofinterest());
		System.out.println("ICICI rate of interest: "+i.getRateofinterest());
		System.out.println("Axis rate of interest:" +a.getRateofinterest());
	
	}
	}

