package oopHomework;

public class Student extends User {
	
	private int studentId;
	
	public Student() {}
	
	public Student(int studentId, String firstName, String lastName, String nationalIdentity) {
		super( firstName, lastName, nationalIdentity);
		this.studentId = studentId;
		
	}
		
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	

}
