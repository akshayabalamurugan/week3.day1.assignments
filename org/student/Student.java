package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("The student name is Akshaya Balamurugan");
	}
	public void studentDept() {
		System.out.println("The student belongs to EEE department");
	}
	public void studentId() {
		System.out.println("The StudentID for Akshaya Balamurugan is 1115105006");
	}
	
	public static void main(String[] args) {
		Student myStudent= new Student();
		myStudent.collegeName();
		myStudent.collegeCode();
		myStudent.collegeRank();
		myStudent.deptName();
		myStudent.studentName();
		myStudent.studentId();
		myStudent.studentDept();
	}
}
