package main;

public class SchoolIntegrationHub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		AttendanceSystem attendanceSystem = new AttendanceSystem();
		GradingSystem gradingSystem = new GradingSystem();
		LibrarySystem librarySystem = new LibrarySystem();
		
		SchoolManagementApp attendanceSystemAdapter = new AttendanceSystemAdapter(attendanceSystem,"12345","tardy","2025-10-06 07:41");
		SchoolManagementApp gradingSystemAdapter = new GradingSystemAdapter(gradingSystem,"12345","CS101","95");
		SchoolManagementApp librarySystemAdapter = new LibrarySystemAdapter(librarySystem,"12345","B789","b");

		
		attendanceSystemAdapter.integrateSystem();
		gradingSystemAdapter.integrateSystem();
		librarySystemAdapter.integrateSystem();
	}

}
