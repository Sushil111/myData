package com.example.jspWebApplication.JPATest;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jspWebApplication.Entities.Employee;

public interface JPATest extends JpaRepository<Employee, Integer> {

}
