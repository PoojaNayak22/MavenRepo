package com.dxc.jpacrud.ui;

import com.dxc.jpacrud.entities.Student;
import com.dxc.jpacrud.service.IStudentService;
import com.dxc.jpacrud.service.StudentServiceImpl;

public class UserInteraction {

    public static void main(String[] args) {
	
	/**
	 *  Debug this program as Debug -> Debug as Java Application 
	 */
	
	IStudentService service = new StudentServiceImpl();
	
	Student student = new Student();
	
	student.setStudentID(generateStudentID());
	student.setStudentName("Pooja");
	
	service.addStudent(student);
	
	System.out.println(student.getStudentName() + " is added to Database...");
	
	//student = service.getStudentById(85771);
	//student.setStudentName("Sachin Tendulkar");	  
	
	//service.updateStudent(student);
	
	//System.out.println(student.getStudentName() + " is updated to Database...");
	
	student = service.getStudentById(123); 		
	
	//service.removeStudent(student);
	
	//System.out.println(student.getStudentID() + " is removed from Database...");
	
	
	
	System.out.println("Thank you !!");		
			
    }
    
    public static long generateStudentID() {
	return (long) (Math.random() * 1000000);
    }
}
