package com.cg.dao;

import com.cg.entity.Student;

public interface StudentDao {

	public abstract Student getStudentById(int studentid);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);

	public abstract void commitTransaction();
	public abstract void beginTransaction();
}