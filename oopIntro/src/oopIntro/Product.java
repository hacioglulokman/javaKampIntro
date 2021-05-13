package oopIntro;

public class Product {
	
	int id;
	String name;
	double unitPrice;
	String details;
	
	public Product() {}
	
	
	public Product(int id, String name, double unitPrice, String details) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.details = details;
	}
	
	/*public Product() {
		System.out.println("Ben calistim");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.details=detail;*/
	/* } */
}
