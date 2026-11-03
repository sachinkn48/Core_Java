package com.tnsif.inheritance;

public class Student extends Person {
	private String collegeName;
	private int batch;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public Student() {
		super();
		this.collegeName="PES";
		this.batch=2027;
	
	}
	public Student(int id, String name, String address,String collegeName,int batch) {
		super(id,name,address);
		this.collegeName=collegeName;
		this.batch=batch;
	}
	
	public Student(String collegeName, int batch) {
		super.setId(123);
		super.setName("Gayatri");
		super.setAddress("PES");
		this.collegeName = collegeName;
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", batch=" + batch + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAddress()=" + getAddress() + "]";
	}
	}
