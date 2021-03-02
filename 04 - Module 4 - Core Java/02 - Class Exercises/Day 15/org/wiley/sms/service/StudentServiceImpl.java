package org.wiley.sms.service;

import java.util.Map;

import org.wiley.sms.bean.Address;
import org.wiley.sms.bean.Student;
import org.wiley.sms.exception.GenderNotFoundException;
import org.wiley.sms.exception.StudentNotFoundException;

public class StudentServiceImpl implements StudentServiceIntf {

	@Override
	public long addStudent(String name, String gender, Address address) throws GenderNotFoundException {
		gender = gender.toLowerCase();
		org.wiley.sms.bean.Student student = new Student(name, gender, address); 
		Student.students.put(student.getId(), student);
		return student.getId();
	}

	@Override
	public Map<Long, Student> getAllStudents() {
		return Student.students;
	}

	@Override
	public Student getStudentById(long id) throws StudentNotFoundException {
		Student student = Student.students.get(id);
		if(student == null) {
			throw new StudentNotFoundException("Student with id " + id + " not found");
		}
		return student;
	}
}