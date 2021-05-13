package oopIntro;

public class Main {

	public static void main(String[] args) {
		
	Product product1 = new Product(1, "lenova v14", 1500, "16 GB Ram");  //referans olustura!	
	
	Product product2 = new Product(); 
	product2.id=2;
	product2.name="lenovo v15";
	product2.unitPrice=1500;
	product2.details="32 GB Ram";
	
	Product product3 = new Product(); 
	product3.id=1;
	product3.name="hp";
	product3.unitPrice=6000;
	product3.details="8 GB Ram";
	
	
	Product[] products = {product1,product2,product3};
	
	
	for (Product product : products) {
		
		System.out.println(product.name);
		
	}
	
	System.out.println(products.length);
	
	Category category1 = new Category();
	category1.id=1;
	category1.name = "bilgisayar";
	
	Category category2 = new Category();
	category2.id=2;
	category2.name = "ev/bahce";
	
	ProductManager productManager = new ProductManager();
	productManager.addToCart(product1);
	productManager.addToCart(product2);
	productManager.addToCart(product3);
	
	
	}
}
