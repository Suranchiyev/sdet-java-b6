package day43;

public class InheritanceDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.firstName = "John";
		student.lastName = "Doe";
		student.age = 25;
		// student.address = "101 main st";
		
		System.out.println(student.getFullName());
		
		student.studentId = 1001;
		student.course = "Java";
		student.grade = 'A';
		student.printAllDetails();
		
	}
}
