package com.dxc.jpacrud.dao;

import com.dxc.jpacrud.entities.Student;

public interface IStudentDAO {

    public abstract Student getStudentById(long studentID);

    public abstract void addStudent(Student student);

    public abstract void removeStudent(Student student);

    public abstract void updateStudent(Student student);

    public abstract void commitTransaction();

    public abstract void beginTransaction();
}
