package part01;

import java.util.ArrayList;

public class StudentTester {

	public static void main(String[] args) {
		CSC_Student amy = new CSC_Student("Amy", "Smyth", Pathway.CIT, "Google");
		CSC_Student patrick = new CSC_Student("Patrick", "Stewart", Pathway.SE, "Microsoft");
		CSC_Student john = new CSC_Student("John", "Fraser", Pathway.CS, "Apple");
		CSC_Student sheila = new CSC_Student("Sheila", "Williams", Pathway.BIT, "Facebook");
		CSC_Student jim = new CSC_Student("Jim", "Hopkins", Pathway.CS, "Amazon");
		
		ArrayList<CSC_Student> students = new ArrayList<CSC_Student>();
		students.add(amy);
		students.add(patrick);
		students.add(john);
		students.add(sheila);
		students.add(jim);
		
		
		printStudents(students);
		
		numStudents(students, Pathway.CS);
		
		numStudents(students);
		
	}
	
	public static void printStudents(ArrayList<CSC_Student> students) {
		
		for(CSC_Student s: students) {
			System.out.println(s.getDetails());
		}
	}
	
	
	
	public static void numStudents(ArrayList<CSC_Student> students, Pathway course) {
		
		int count = 0;
		for(CSC_Student s: students) {
			if(s.getCourse() == course) {
				count++;
			}
		}
		System.out.println("The number of students taking " + course.description() + " is " + count);
	}
	
	
	public static void numStudents(ArrayList<CSC_Student> students) {
		
		System.out.println("The number of students studying computing is " + students.size());	
	}
}
