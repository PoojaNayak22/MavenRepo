package com.dxc.jpacrud.dao;

import javax.persistence.EntityManager;
import com.dxc.jpacrud.connection.JPAConnection;
import com.dxc.jpacrud.entities.Student;

public class StudentDAOImpl implements IStudentDAO {

    private EntityManager entityManager;

    public StudentDAOImpl() {
	entityManager = JPAConnection.getEntityManager();
    }
    
    @Override
    public void addStudent(Student student) {
	entityManager.persist(student);
    }
    
    @Override
    public void updateStudent(Student student) {
	entityManager.merge(student);
    }
    
    @Override
    public void removeStudent(Student student) {
	entityManager.remove(student);
    }
    
    @Override
    public Student getStudentById(long studentID) {
	Student student = entityManager.find(Student.class, studentID);
	return student;
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
