package com.coforge.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Employee;



public class HQLMainClass {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");  
		
		SessionFactory factory =  configuration.buildSessionFactory();	
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//HQL Select All
//		Query query = session.createQuery("from Employee");
//		List<Employee> list = query.list();
//		System.out.println(list); 
		
		//HQL static select
//		Query query = session.createQuery("from Employee where eid = 201");
//		List<Employee> list = query.list();
//		System.out.println(list);
		
		
		//HQL dynamic select
//		Query query = session.createQuery("from Employee where eid = :id");
//		query.setParameter("id", 201);
//		List<Employee> list = query.list();
//		System.out.println(list);
		
		//HQL specific column select
//		Query query = session.createQuery("select ename from Employee"); //ename is bean property and Employee is the bean class name not table name
//		List<String> list = query.list();
//		System.out.println(list);
		
		
		//HQL Update
//		Query query = session.createQuery("update Employee set ename = :name where eid = :id");
//		query.setParameter("name", "Sahil Kumar");
//		query.setParameter("id", 201);
//		int n  = query.executeUpdate();
//		
//		if(n == 1) System.out.println("Employee object updated");
//		else System.out.println("Employee object not updated");
		
		//HQL Delete
//		Query query = session.createQuery("delete from  Employee where eid = :id");
//		query.setParameter("id", 201);
//		int n  = query.executeUpdate();
//		
//		if(n == 1) System.out.println("Employee object deleted");
//		else System.out.println("Employee object not deleted");


		transaction.commit();
		session.close();
		factory.close();
		
	}

}
