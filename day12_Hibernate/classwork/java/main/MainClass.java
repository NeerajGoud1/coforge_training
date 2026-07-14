package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Employee;



public class MainClass {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");  // this will do connection configuration and mapping
		
		SessionFactory factory =  configuration.buildSessionFactory();	
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		// all these above classes are from hibernate framework
		 
		Employee employee = new Employee(202, "Bablu", 50000, 10);
		//session.save(employee); //Insert
		//session.update(employee); //Update
        //session.delete(employee);
		
		//select one specific record
	   Employee emp = session.get(Employee.class, 201); //(entity class, id) to specify which entity (table) data u need
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println("Employee Information " + emp);
	}

}
