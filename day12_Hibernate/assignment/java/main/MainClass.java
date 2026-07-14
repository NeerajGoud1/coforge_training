package com.coforge.main;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Student;
import com.coforge.model.Course;

public class MainClass {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml"); // this will do connection configuration and mapping

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student = new Student(103, "Kumar");
//		Course course1 = session.get(Course.class, 10);
//		Course course2 = session.get(Course.class, 20);
 
	
		//one student enrolling multiple courses
//		student.setCourses(Arrays.asList(course1, course2)); 
//		session.create(student);   
		
		
		
		//a course can be enrolled by multiple students
//		Course course = new Course(50, "Spring");
		Student student1 = session.get(Student.class, 101);
//		Student student2 = session.get(Student.class, 102);
//		
//		course.setStudents(Arrays.asList(student1, student2));
//		session.update(course);  //while creating or updating u can assign

//		transaction.commit();
		System.out.println("Courses are : " + student1.getCourses());
		session.close();
		factory.close();

	}

}
