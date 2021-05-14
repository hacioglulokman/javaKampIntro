package oopIntro;

public class Product {
	
	private int id;
	private String name;
	private double unitPrice;
	private String details;
	private double afterUnitPrice;
	
	public Product() {}
	
	
	public Product(int id, String name, double unitPrice, String details) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.details = details;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public double getAfterUnitPrice() {
		return afterUnitPrice;
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
