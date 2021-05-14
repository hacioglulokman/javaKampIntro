package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="123";
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		
		hepsiburada.customerNumber="434";
		
		CustomerManager customerManager =new CustomerManager();
		customerManager.add(engin);
		customerManager.add(hepsiburada);
		
	}

}
