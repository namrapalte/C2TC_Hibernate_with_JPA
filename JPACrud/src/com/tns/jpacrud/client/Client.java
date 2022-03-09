package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServicelmpl;


public class Client {

		public static void main(String[] args) 
		{
			
			// CRUD operation calling activity
			Student student = new Student();
			
			StudentService service = new StudentServicelmpl();
			
			// Create Operation
				
			student.setStudentid(6);
			student.setName("Hemant ");
			student.setage(24);
			student.setName1("Mechanics");
			student.setName2("Mumbai");
			service.addStudent(student);
			
			/*
	
	
		// Retrieve Operation
			service.findStudentById(1);
			System.out.println("ID is: "+student.getStudentid());
			System.out.println("Name is: "+student.getName());
			System.out.println("Age is: "+student.getage());
			*/
			
			
			
//			//Update Operation
//			student  =service.findStudentById(3);
//			student.setName("Namra ");
//			service.updateStudent(student);
			
			
//			service.findStudentById(3);
//			System.out.println("ID is: "+student.getStudentid());
//			System.out.println("Name is: "+student.getName());
//			
			
			// Delete Operation
//			student=service.findStudentById(2);
//			service.removeStudent(student);
//			System.out.println("Row removed");
//			
//			
		}

	}

