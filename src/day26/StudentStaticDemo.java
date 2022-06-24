package day26;

public class StudentStaticDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.fullName = "John Doe";
		student.course = "Java";
		student.grade = 80.5;
		// student.address = "abc"; // not correct way of using static variable
		Student.address = "101 Main st";
		
		System.out.println(student.fullName); // John Doe
		System.out.println(student.course); // Java
		System.out.println(student.grade); // 80.5
		System.out.println(student.address); // 101 Main st
		System.out.println("--------");
		
		Student studentTwo = new Student();
		System.out.println(studentTwo.fullName); // null
		System.out.println(studentTwo.course); // null
		System.out.println(studentTwo.grade); // 0.0
		System.out.println(studentTwo.address); // 101 Main st
	}
}
