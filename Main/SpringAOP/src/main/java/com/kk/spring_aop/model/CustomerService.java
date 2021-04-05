package com.kk.spring_aop.model;

public class CustomerService {

	private String name;
	private String url;

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public void printName() {
		System.out.println("Customer name : "+ this.name);
	}
	
	public void printUrl() {
		System.out.println("Customer Website : "+this.url);
	}
	
	public void printThrowException() {
		throw new IllegalArgumentException();
	}

}
