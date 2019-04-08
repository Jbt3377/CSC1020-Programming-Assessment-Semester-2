package part01;

public class Student {
	private static int ID = 40200000;
	private String forename;
	private String surname;
	private int studentNumber;
	
	//Constructor of the Student class
	public Student(String forename,String surname) {
		this.forename = forename;
		this.surname = surname;
		Student.ID++;
		this.studentNumber = Student.ID;
	}
	//getDetails() method prints information in the form:
	/*
	 * Name: John Smith
	 * Student Number: 40200001 
	 */
	public String getDetails() {
		return "Name: "+this.forename+" "+this.surname+"\nStudent Number: "+this.studentNumber;
	}

	//The following three accessor method return the forename, surname and student number.
	public String getForename() {
		return this.forename;
	}
	public String getSurname() {
		return this.surname;
	}
	public int getStudentNumber() {
		return this.studentNumber;
	}
	
}
