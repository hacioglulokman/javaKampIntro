package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="123";
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		
		hepsiburada.customerNumber="434";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="42134";
		
		CustomerManager customerManager =new CustomerManager();
		Customer [] customers = {engin, hepsiburada, abc};
		customerManager.addMultiple(customers);
		
		
		
		/*
		 * customerManager.add(engin); customerManager.add(hepsiburada);
		 */
		
	}

}
