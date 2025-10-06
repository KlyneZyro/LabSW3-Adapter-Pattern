package main;

public class GradingSystemAdapter implements SchoolManagementApp {
	private GradingSystem gradingSystem;
	private String studentId;
	private String courseId;
	private String grade;
	
	public GradingSystemAdapter(GradingSystem gradingSystem, String studentId, String courseId, String grade) {
		this.gradingSystem = gradingSystem;
		this.studentId = studentId;
		this.courseId = courseId;
		this.grade = grade;
	}

	@Override
	public void integrateSystem() {
		System.out.println("Grade recorded successfully");		
	}

}
