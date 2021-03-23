package com.kk.spring.springbasicexample.model;

public class Employee {

	private int empid;
	private String empName;
	private long salary;

	public Employee() {
	}

	public Employee(int empid, String empName, long salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	public void myInit() {
		System.out.println("Initialization");
	}
	
	public void myDestroy() {
		System.out.println("Destroy Method calling");
	}
}
