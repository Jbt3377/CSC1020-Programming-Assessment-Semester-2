package part03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RegistrationTester {

	public static void main(String[] args) {
		
		String myDir = "C:\\\\Users\\\\40230451\\\\CSC1020Exam\\\\Assessment03\\\\Assessment03\\\\QUB_CSC_registered_students.csv";
		int CS_students = 0, SE_students = 0, total_student_inEEECS = 0;
		
		try {
			File myFile = new File(myDir);
			Scanner myScanner = new Scanner(myFile);
			
			// Ignore Header
			myScanner.nextLine();
			
			while(myScanner.hasNextLine()) {
				
				// Get current record
				String currentRecord = myScanner.nextLine();
				
				// Separate the fields
				String[] recordParts = currentRecord.split(",");
				
				// Trim required data
				int CIT = Integer.parseInt(recordParts[1].trim());
				int BIT = Integer.parseInt(recordParts[2].trim());
				int CS = Integer.parseInt(recordParts[3].trim());
				int SE = Integer.parseInt(recordParts[4].trim());
				
				// Increase student count for CS and SE with current year group stats
				CS_students += CS;
				SE_students += SE;
				
				// Increase total EEECS student count
				total_student_inEEECS += CIT+BIT+CS+SE;
				
			}
			
			// Close Scanner
			myScanner.close();
			
			// Output total percentages of registered CS and SE students across all year groups
			printPercentages(CS_students, SE_students, total_student_inEEECS);
			
		}catch(FileNotFoundException fnfe) {
			System.out.println("File at directory:\n" + myDir + "\nCannot be found. The directory for registered students may have changed.");
		}
		
	}
	
	
	
	/*
	 * Method outputs total percentages of registered CS and SE students across all year groups
	 */
	public static void printPercentages(int CS_students, int SE_students, int total_student_inEEECS) {
		System.out.printf("The percentage of CS students registered is %.1f\n", (CS_students/ (double) total_student_inEEECS)*100 );
		System.out.printf("The percentage of SE students registered is %.1f\n", (SE_students/ (double) total_student_inEEECS)*100 );
	}

}
