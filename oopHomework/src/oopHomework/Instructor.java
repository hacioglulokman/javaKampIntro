package oopHomework;

public class Instructor extends User{

	private int instructorId;
	
	public Instructor() {}
	

	public Instructor(int instructorId , String firstName, String lastName, String nationalIdentity) {
		super(firstName, lastName, nationalIdentity);
		this.instructorId = instructorId;
	}


	public int getInstructorId() {
		return instructorId;
	}


	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
}
