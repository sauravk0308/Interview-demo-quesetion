package com.interview.question.prototype;

import java.util.ArrayList;
import java.util.List;

public class StudentDao implements Cloneable{

	private static List<Student> sutudentList;
	
	static {
		sutudentList = new ArrayList<>();
		
		Student student = new Student();
		student.setName("AA");
		student.setId(1);
		
		sutudentList.add(student);
	}
	
	public List<Student> getAllStudents(){
		return sutudentList;
	}
	
	@Override
	public List<Student> clone() throws CloneNotSupportedException{
		List<Student> dummyStudentList = new ArrayList<>();
		for(Student student : dummyStudentList) {
			dummyStudentList.add(student);
		}
		return dummyStudentList;
	}
}
