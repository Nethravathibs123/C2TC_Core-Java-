package com.cg.inheritance;

public class Mobile {//parent class 
private String manufacturer;
private String operatingsystem;
private String model;
private String cost;

	
public Mobile(String manufacturer, String operatingsystem, String model, String cost) {
	super();
	this.manufacturer = manufacturer;
	this.operatingsystem = operatingsystem;
	this.model = model;
	this.cost = cost;
}
public String getmodel()
{
	return model;
}
@Override//method of overriding
public String toString() {
	return "Mobile [manufacturer=" + manufacturer + ", operatingsystem=" + operatingsystem + ", model=" + model
			+ ", cost=" + cost + "]";
}

	

	}


