package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Student Name is Sivaranjani");
	}
	public void studentDept()
	{
		System.out.println("Department name is CSE");
	}
	
	public void studentId()
	{
		System.out.println("Student Id number is 100");
	}
	
	public static void main(String[] args) {
		
		Student stud=new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		

	}

}
