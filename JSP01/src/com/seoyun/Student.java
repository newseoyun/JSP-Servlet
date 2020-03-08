package com.seoyun;

public class Student {

	private String name;
	private boolean goldCustomer;
	
	public Student(String name, boolean goldCustomer) {
		super();
		this.name = name;
		this.goldCustomer = goldCustomer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGoldCustomer() {
		return goldCustomer;
	}
	public void setGoldCustomer(boolean goldCustomer) {
		this.goldCustomer = goldCustomer;
	}

}
