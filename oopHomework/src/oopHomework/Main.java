package oopHomework;

public class Main {

	public static void main(String[] args) {
		
	Instructor instructor1 = new Instructor();
	instructor1.setFirstName("ali");
	instructor1.setLastName("genc");
	instructor1.setInstructorId(1);
	
	Instructor instructor2 = new Instructor(3, "huseyin", "kara", "2314541");

	InstructorManager instructorManager = new InstructorManager();
	instructorManager.add(instructor1);
	instructorManager.add(instructor2);
	
	
	Student student1 = new Student(2,"ahmet" ,"genc" , "131243531");
	Student student2 = new Student(3,"hasan" ,"genc" , "1323121331");
				
		
	StudentManager studentManager = new StudentManager();
	studentManager.Add(student1);
	studentManager.Add(student2);

	UserManager userManager = new UserManager();
		User [] users = {student1,student2,instructor1,instructor2};
		for (User user : users) {
			
			System.out.println(user.getFirstName()+" " +user.getLastName()+"  dataabase eklendi");
			
		}
	
	}
	
	
}


