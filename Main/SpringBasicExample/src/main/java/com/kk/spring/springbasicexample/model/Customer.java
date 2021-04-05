package com.kk.spring.springbasicexample.model;

public class Customer {

	private int cusId;
	private String name;
	private Address address;

	public Customer() {
	}

	public Customer(Address address) {
		this.address = address;
	}
	
	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", name=" + name + ", address=" + address + "]";
	}

}
