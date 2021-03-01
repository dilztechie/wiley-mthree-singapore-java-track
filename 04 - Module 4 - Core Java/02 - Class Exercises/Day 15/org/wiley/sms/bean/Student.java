package org.wiley.sms.bean;

public class Student {
	private long id;
	private String name;
	private String gender;
	private Address address;
	
	private java.util.List<String> genders;
	private static long idCount;
	
	public static java.util.List<Student> students;

	public void setGender(String gender) throws org.wiley.sms.exception.GenderNotFoundException {
		genders = new java.util.ArrayList<>();
		genders.add("male");
		genders.add("female");
		if(java.util.Collections.binarySearch(genders, gender) >= 0) {
			this.gender = gender;
		} else {
			throw new org.wiley.sms.exception.GenderNotFoundException("Gender " + gender + " not found");
		}
	}
	
	public long getId() {
		return id;
	}
	
	public Student(String name, String gender, Address address) 
			throws org.wiley.sms.exception.GenderNotFoundException {
		students = new java.util.ArrayList<>();
		this.id = ++idCount;
		this.name = name;
		setGender(gender);
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}	
}