package com.kk.learning.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	private int id;
	private String name;
	private int salary;
	
	@Autowired
	private Technologies technologies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Technologies getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Technologies technologies) {
		this.technologies = technologies;
	}

	public void printDetails() {
		System.out.println("Object created successfully");
		technologies.display();
	}

}
