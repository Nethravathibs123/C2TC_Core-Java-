package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private EntityManager entityManager;
	public StudentDaoImpl() {
	entityManager = JPAUtil.getEntityConnection();
	}
	@Override
	public Student getStudentById(int studentId) {
		Student student = entityManager.find(Student.class, studentId);
		return student;
	}
	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
		
	}
	@Override
	public void removeStudent(Student student) {
		entityManager.remove(student);			
	}
	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);			
	}
			@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
			@Override
			public void commitTransaction() {
				entityManager.getTransaction().commit();					
			}
			

}
