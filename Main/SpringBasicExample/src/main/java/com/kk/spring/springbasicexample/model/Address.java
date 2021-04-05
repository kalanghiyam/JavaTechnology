package com.kk.spring.springbasicexample.model;

public class Address {

	private String streetName;
	private String city;
	private long pincode;

	public Address() {
	}

	public Address(String streetName, String city, long pincode) {
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
