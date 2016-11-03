package com.hibernate.HibernateDemo;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemoMain {

	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		
		
//		//CREATE
//		Product product = new Product("Laptop", 40000);
//	
//		Session session_1= sessionfactory.openSession();
//		Transaction transaction=session_1.beginTransaction();
//		
//		session_1.save(product);
//		transaction.commit();
//		session_1.flush();
//		session_1.close();
//		
//		
//		
//		//READ
//		
//		Session session_2 = sessionfactory.openSession();
//		Product product2=session_2.get(Product.class, 2l);
//		System.out.println(product2);
//		session_2.close();
//		
//		
//		//UPDATE
//		
//		Session session_3=sessionfactory.openSession();
//		Transaction t2=session_3.beginTransaction();
//		Product product_3=session_3.get(Product.class, 2l);
//		product_3.setName("Macbook");
//		session_3.update(product_3);
//		t2.commit();
//		session_3.flush();
		
		//DELETE
		
		Session session_4=sessionfactory.openSession();
		Transaction t3=session_4.beginTransaction();
		Product p3=session_4.get(Product.class, 2l);
		session_4.delete(p3);
		t3.commit();
		session_4.close();
		
		
				
		sessionfactory.close();		
			
	}
}
