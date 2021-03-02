package org.wiley.sms.bean;

public class Student {
	private long id;
	private String name;
	private String gender;
	private Address address;
	
	private static String[] strGenders = {"male", "female"};
	// private static java.util.List<String> genders = new java.util.ArrayList<>(java.util.Arrays.asList(strGenders));
	private static long idCount;
	
	public static java.util.Map<Long, Student> students = new java.util.TreeMap<>();

	public void setGender(String gender) throws org.wiley.sms.exception.GenderNotFoundException {
		boolean found = false;
		for(String strGender : strGenders) {
			if(strGender.equalsIgnoreCase(gender)) {
				found = true;
				break;
			}
		}
		if(found) { // if(java.util.Collections.binarySearch(genders, gender) >= 0) {
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