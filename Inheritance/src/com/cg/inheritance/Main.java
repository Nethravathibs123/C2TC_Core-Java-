package com.cg.inheritance;

public class Main {
public static void main(String[] args) {
Mobile mobileObj=new Mobile("windows", "windows", "recent", "80000");//mobile data
System.out.println(mobileObj);

Android andObj=new Android("android", "android", "5000", "20000");//android data
System.out.println(andObj);

Blackberry blackObj=new Blackberry("Blackberry", "Blackberry", "key1", "150000");//blackberry data
System.out.println(blackObj);
}
}
