package main;

public class LibrarySystemAdapter implements SchoolManagementApp {
	private LibrarySystem librarySystem;
	private String studentId;
	private String bookId;
	private String action;
	
	public LibrarySystemAdapter(LibrarySystem librarySystem, String studentId, String bookId, String action) {
		this.librarySystem = librarySystem;
		this.studentId = studentId;
		this.bookId = bookId;
		this.action = action;
	}
	@Override
	public void integrateSystem() {
		System.out.println("Book borrowed successfully");		
	}

}
