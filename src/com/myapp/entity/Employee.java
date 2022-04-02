package com.myapp.entity;

public class Employee {

	private int employee_id;
	private String employee_name;
	private long contact;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employee_id, String employee_name, long contact) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.contact = contact;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", contact=" + contact
				+ "]";
	}
	
	
	
	
	
}
