package com.dxc.jpacrud.service;

import com.dxc.jpacrud.entities.Student;

public interface IStudentService {

    public abstract Student getStudentById(long studentID);

    public abstract void addStudent(Student student);

    public abstract void removeStudent(Student student);

    public abstract void updateStudent(Student student);	
    
}
