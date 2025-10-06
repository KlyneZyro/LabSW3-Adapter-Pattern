package main;

public class AttendanceSystemAdapter implements SchoolManagementApp {
	private AttendanceSystem attendanceSystem;
	private String studentId;
	private String status;
	private String timeStamp;

	
	public AttendanceSystemAdapter(AttendanceSystem attendanceSystem, String studentId, String status, String timeStamp) {
		this.attendanceSystem = attendanceSystem;
		this.studentId = studentId;
		this.status = status;
		this.timeStamp = timeStamp;
	}

	@Override
	public void integrateSystem() {
		System.out.println("Attendance marked successfully");		
	}
	

}
