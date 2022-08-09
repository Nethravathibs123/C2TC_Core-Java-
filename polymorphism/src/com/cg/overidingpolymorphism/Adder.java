package com.cg.overidingpolymorphism;

public class Adder {
static int add( int a,int b) {//int type
	return a+b;
}
static double add(double a,double b, int c) {//double type
	return a+b+c;
}
public static void main(String[] args) {
	System.out.println(add(11,111));//print statement
	System.out.println(add(11,12,34));
}

}
