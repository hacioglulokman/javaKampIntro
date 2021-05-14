package oopHomework;

public class UserManager {
	
	public void add(User user) {
		
	}
	
	public void multiAdd(User [] users) {
		
		for (User user1 : users) {
			
			add(user1);	
		}
	}
	
	public void update(User user) {
		
		System.out.println("guncellendi");
	}
	public void multiUpdate (User [] users) {
	
		for (User user2 : users) {
			update(user2);
		}
	}
	

	public void delete(User user) {
		
		System.out.println(user.getFirstName() +" silindi.");
	
	}
	
	public void multiDelete (User[]users) {
		for (User user3 : users) {
			
			delete(user3);
		}
	}
	

}
