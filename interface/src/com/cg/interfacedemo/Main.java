package com.cg.interfacedemo;
interface bank{
	float Rateofinterest();//method
}
class SBI implements bank{//inherited from parent(bank) to child class(SBI)
	public float Rateofinterest()
	{
		return 9.15f;
	}
}
class HDFC implements bank//inherited from parent(bank) to child class(HDFC)
{
	public float Rateofinterest()
	{
		return 9.7f;
		
	}
}
public interface Main {//main class
public static void main(String args[]) {
bank b=new SBI();//object creation
System.out.println("Rateofinterest: " +b.Rateofinterest());
}
}