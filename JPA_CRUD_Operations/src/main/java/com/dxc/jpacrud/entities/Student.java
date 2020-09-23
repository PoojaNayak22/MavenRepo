package com.dxc.jpacrud.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student implements Serializable {

    private static final long serialVersionUID = 6658370755983201149L;
    
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_ID")
    private long studentID;
    
    @Column(name = "Student_Name")
    private String studentName;
    
    public long getStudentID() {
        return studentID;
    }
    
    public void setStudentID(long studentID2) {
        this.studentID = studentID2;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
	return "Student [Student_ID : " + studentID + ", Student_Name : " + studentName + "]";
    } 
}
