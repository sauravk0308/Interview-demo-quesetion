package com.interview.question.prototype;

import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		StudentDao studentDao = new StudentDao();
		List<Student> allStudents = studentDao.getAllStudents();
		
		List<Student> updatedStudentList = studentDao.clone();
		
		Student student = new Student();
		student.setName("BB");
		student.setId(2);
		updatedStudentList.add(student);
		
		System.out.println(updatedStudentList);
	}

}
