package org.student01;

import org.department01.department;

public class Student extends department {

	public void studentName() {
		System.out.println("Ravi");
	}

	public void studentDept() {
		System.out.println("ECE");
	}

	public void studentId() {
		System.out.println("007");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();

		obj.deptName();

		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}
