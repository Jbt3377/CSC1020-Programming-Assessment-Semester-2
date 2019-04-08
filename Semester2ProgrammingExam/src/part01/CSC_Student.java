package part01;

public class CSC_Student extends Student implements Placement{
	
	private Pathway course;
	private String placement_company;

	public CSC_Student(String forename, String surname, Pathway course, String placement_company) {
		super(forename, surname);
		this.course = course;
		this.placement_company = placement_company;
		
	}

	@Override
	public void yearOfProPractice() {
		System.out.println("Working at " + this.placement_company);
	}
	
	@Override
	public String getDetails() {
		return "Name: " + this.getForename() + " " + this.getSurname() + "\nStudent number: " + this.getStudentNumber() + "\nPlacement Company: " + this.placement_company + "\n\n";
	}

	public Pathway getCourse() {
		return course;
	}
	
	
	
	
	

}
