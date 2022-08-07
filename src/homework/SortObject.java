package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortObject {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("C", "D", "E", "A", "B"));
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		List<Student> listTwo = new ArrayList<>();
		listTwo.add(new Student("John", 85.0));
		listTwo.add(new Student("Kuba", 90.0));
		listTwo.add(new Student("Smith", 50.0));
		listTwo.add(new Student("Ramesh", 65.0));
		listTwo.add(new Student("Alex", 75.0));
		System.out.println(listTwo);
		
		Collections.sort(listTwo);
		System.out.println(listTwo);
	}
}

class Student implements Comparable {
	public String name;
	public double score;
	
	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student argStudent = (Student) o;
		return Double.compare(score, argStudent.score);
	}

}
