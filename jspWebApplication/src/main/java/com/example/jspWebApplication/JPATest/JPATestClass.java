package com.example.jspWebApplication.JPATest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.jspWebApplication.Entities.Employee;

@Configuration
public class JPATestClass {

	@Autowired
	public JPATest jpaTest;

	@Bean
	Employee TestJPABean() {
		Employee e1 = new Employee();
		e1.setName("Testing_1");
		e1.setDesign("Test_design");
		jpaTest.save(e1);
		System.out.println("JPA bean testing :" + jpaTest.findById(1).get().getName() + " "
				+ jpaTest.findById(1).get().getDesign());
		return jpaTest.getById(1);
	}

}
