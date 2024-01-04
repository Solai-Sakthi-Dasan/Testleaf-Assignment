package week4.day4.assignment.org.student;

import week4.day4.assignment.org.department.Department;

public class Student extends Department {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		//College methods
		System.out.println("College Methods");
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		System.out.println("");
		
		//Department methods
		System.out.println("Department Method");
		student.deptName();
		System.out.println("");
		
		//Student methods
		System.out.println("Student Methods");
		student.studentName();
		student.studentDept();
		student.studentId();
		
	}
	
	public void studentName() {
		System.out.println("Solai Sakthi Dasan");
	}
	
	public void studentDept() {
		System.out.println("Information Technology");
	}
	
	public void studentId() {
		System.out.println("312019205035");
	}

}
