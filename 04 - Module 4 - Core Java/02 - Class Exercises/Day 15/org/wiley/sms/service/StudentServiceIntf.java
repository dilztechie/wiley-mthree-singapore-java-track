package org.wiley.sms.service;

public interface StudentServiceIntf {
	public long addStudent(String name, String gender, org.wiley.sms.bean.Address address) 
			throws org.wiley.sms.exception.GenderNotFoundException;
	public java.util.Map<Long, org.wiley.sms.bean.Student> getAllStudents();
	public org.wiley.sms.bean.Student getStudentById(long id) 
			throws org.wiley.sms.exception.StudentNotFoundException;
}