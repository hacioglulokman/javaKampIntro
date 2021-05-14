package oopIntro;

public class Main {

	public static void main(String[] args) {
		
	Product product1 = new Product(1, "lenova v14", 1500, "16 GB Ram");  //referans olustura!	
	
	Product product2 = new Product(); 
	product2.setId(2);
	product2.setName("lenovo v15");
	product2.setUnitPrice(1500);
	product2.setDetails("32 GB RAM");
	
	/*
	 * Product product3 = new Product(); product3.id=3; product3.name="hp";
	 * product3.unitPrice=6000; product3.details="8 GB Ram";
	 */
	
	
	Product[] products = {product1,product2};
	
	
	for (Product product : products) {
		
		System.out.println(product.getName());
		
	}
	
	System.out.println(products.length);
	
	
	Category category1 = new Category();
	category1.setId(1);
	category1.setName("yiyecek");
	
	System.out.println(category1.getName());
	
	Category category2 = new Category();
	category2.id=2;
	category2.name = "ev/bahce";
	
	ProductManager productManager = new ProductManager();
	productManager.addToCart(product1);
	productManager.addToCart(product2);
	
	
	}
}
