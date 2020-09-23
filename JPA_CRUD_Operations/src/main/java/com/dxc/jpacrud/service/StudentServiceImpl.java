package com.dxc.jpacrud.service;

import com.dxc.jpacrud.dao.IStudentDAO;
import com.dxc.jpacrud.dao.StudentDAOImpl;
import com.dxc.jpacrud.entities.Student;

public class StudentServiceImpl implements IStudentService {

    private IStudentDAO dao;

    public StudentServiceImpl() {
	dao = new StudentDAOImpl();
    }	
    
    @Override
    public void addStudent(Student student) {
	dao.beginTransaction();
	dao.addStudent(student);
	dao.commitTransaction();
    }
    
    @Override
    public void updateStudent(Student student) {
	dao.beginTransaction();
	dao.updateStudent(student);
	dao.commitTransaction();
    }
    
    @Override
    public void removeStudent(Student student) {
	dao.beginTransaction();
	dao.removeStudent(student);
	dao.commitTransaction();
    }   
    
    @Override
    public Student getStudentById(long studentID) {
	Student student  = dao.getStudentById(studentID);
	return student;
    }  
}
