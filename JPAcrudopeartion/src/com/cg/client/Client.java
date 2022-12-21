package com.cg.client;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();

		Student student = new Student();
		
	/*	// Create Operation
		student.setStudentId(100);
		student.setName("Sachin");
		service.addStudent(student);
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.getStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());
		
		// Update Operation
		student = service.getStudentById(100);
		student.setName("Sachin Tendulkar");
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section

		student = service.getStudentById(100);
		System.out.print("ID:"+student.getStudentId());
		System.out.println(" Name:"+student.getName());*/
		
		//at this breakpoint, record is removed from table
		// Delete Operation
		student = service.getStudentById(100);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");
}
}