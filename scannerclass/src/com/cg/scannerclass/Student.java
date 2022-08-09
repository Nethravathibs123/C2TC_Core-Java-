package com.cg.scannerclass;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);//scanner class called
System.out.println("enter your student id");
int studid=sc.nextInt();//type int
System.out.println("the id is: " +studid);
System.out.println("enter your name");
sc.nextLine();//type string
System.out.println("enter your name");
String name=sc.nextLine();
System.out.println("my name is:" +name);
System.out.println("enter your mobile number");
long mobileNumber=sc.nextLong();//type long
System.out.println("MobileNumber:" +mobileNumber);
System.out.println("enter your cgpa");
double cgpa=sc.nextDouble();//type double
System.out.println("cgpa" +cgpa);

	}
	

}
