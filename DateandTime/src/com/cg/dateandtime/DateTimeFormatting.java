package com.cg.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

	public static void main(String[] args) {
		LocalDateTime datetime=LocalDateTime.now();//Before Formatting date and time
		System.out.println("Before Formatting" +datetime);//Current date will be printed

	DateTimeFormatter myformatObj=DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");//After formatting date and time
		String formattedDate=datetime.format(myformatObj);//formatting date
		System.out.println("After Formatting" +formattedDate);

		/*DateTimeFormatter myformatObj=DateTimeFormatter.ofPattern("dd-MMM-yyy HH:mm:ss");//After formatting date and time
		String formattedDate=datetime.format(myformatObj);//formatting date   
		System.out.println("After Formatting" +formattedDate); // MMM-Aug is printed
		
		DateTimeFormatter myformatObj=DateTimeFormatter.ofPattern(" E ,dd/MM/yyy HH:mm:ss");//After formatting date and time
		String formattedDate=datetime.format(myformatObj);//formatting date
		System.out.println("After Formatting" +formattedDate);// E=day is printed    */

	}

}
