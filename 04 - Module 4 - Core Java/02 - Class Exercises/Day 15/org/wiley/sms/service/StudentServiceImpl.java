package org.wiley.sms.service;

import java.util.List;

import org.wiley.sms.bean.Address;
import org.wiley.sms.bean.Student;
import org.wiley.sms.exception.GenderNotFoundException;
import org.wiley.sms.exception.StudentNotFoundException;

public class StudentServiceImpl implements StudentServiceIntf {

	@Override
	public long addStudent(String name, String gender, Address address) throws GenderNotFoundException {
		org.wiley.sms.bean.Student student = new Student(name, gender, address); 
		Student.students.add(student);
		return student.getId();
	}

	@Override
	public List<Student> getAllStudents() {
		return Student.students;
	}

	@Override
	public Student getStudentById(long id) throws StudentNotFoundException {
		Student student = null;
		for(Student existStudent : Student.students) {
			if(existStudent.getId() == id) {
				student = existStudent;
				break;
			}
		}
		if(student == null) {
			throw new StudentNotFoundException("Student with id " + id + " not found");
		}
		return student;
	}
}