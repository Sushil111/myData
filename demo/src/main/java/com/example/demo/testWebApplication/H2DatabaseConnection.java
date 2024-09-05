package com.example.demo.testWebApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.example.demo.testWebApplication")
public class H2DatabaseConnection {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Employee s1 = new Employee();
		s1.setId(101);
		s1.setName("Emily");
		s1.setDesign("Tree");
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(session);
		tx.commit();
		session.close();
	}

}
