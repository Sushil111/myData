package com.example.demo.hibernateTest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.example.demo.hibernateTest")
public class H2DatabaseConnection {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Employee s1 = new Employee();
		s1.setId(102);
		s1.setName("Emily");
		s1.setDesign("Tree");
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s1);
		// session.createEntityGraph(Employee.class);
		// session.save(s1);
		Employee e1 = session.get(Employee.class, 1);
		// Employee e2 = (Employee) session.get("employee", 1);
		System.out
				.println("Fetched value from db :" + e1.getId() + "-----" + e1.getDesign() + "-------" + e1.getName());
		Employee e2 = new Employee();
		// s1.setId(102);
		e2.setName("Emiley");
		e2.setDesign("TreePlanting");
		session.save(e2);
		Employee s2 = session.get(Employee.class, 2);
		Employee e3 = session.get(Employee.class, 1);
		List<Employee> li = session.createQuery("from Employee").list();
		for (Employee e : li) {
			System.out
					.println("Fetched value from db :" + e.getId() + "-----" + e.getDesign() + "-------" + e.getName());
		}
		e2.setName("Peacho");
		session.update(e2);
		Employee s3 = session.get(Employee.class, 2);
		System.out
				.println("Fetched value from db :" + e2.getId() + "-----" + e2.getDesign() + "-------" + e2.getName());
		session.delete(e1);
		List<Employee> li1 = session.createQuery("from Employee").list();
		for (Employee e : li1) {
			System.out
					.println("Fetched value from db :" + e.getId() + "-----" + e.getDesign() + "-------" + e.getName());
		}
		tx.commit();
		session.close();
	}

}
