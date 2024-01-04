package week4.day4.assignment.studentInfo;

public class Student {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.getStudentInfo("Sakthi");
		student.getStudentInfo("Sakthi", 'S');
		student.getStudentInfo("Sakthi", 'S', 22);
		student.getStudentInfo("Sakthi", 'S', 22, 19205035);
		
	}
	
	public void getStudentInfo(String name) {
		System.out.println(name);
	}
	
	public void getStudentInfo(String name, char initial) {
		System.out.println(name + " " + initial);
	}
	
	public void getStudentInfo(String name, char initial, int age) {
		System.out.println(name + "-" + initial + "-" + age + "-years old");
	}
	
	public void getStudentInfo(String name, char initial, int age, long registerNumber) {
		System.out.println(name + "-" + initial + " " + age + "-years old " + registerNumber + "-" + "Register-Number");
	}

}
