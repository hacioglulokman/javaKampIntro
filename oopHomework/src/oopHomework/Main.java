package oopHomework;

public class Main {

	public static void main(String[] args) {
		
	Instructor instructor = new Instructor();
	instructor.firstName ="ali";
	instructor.id=1;
	
	
	Student student = new Student();
	student.firstName="ahmet";
	instructor.id=2;
	
	
	
	
	UserManager userManager = new UserManager();
	User [] users = {instructor, student};

	userManager.multiDelete(users);
		
		
	}
		
}


