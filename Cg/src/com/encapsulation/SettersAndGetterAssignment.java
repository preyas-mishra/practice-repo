package com.encapsulation;

class Product{
	private int productId;
	private String productName;
	private int productPrice;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
}

public class SettersAndGetterAssignment {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductId(1001);
		p1.setProductName("Desktop");
		p1.setProductPrice(10000);
		
		Product p2 = new Product();
		p2.setProductId(1002);
		p2.setProductName("Keyboard");
		p2.setProductPrice(1500);
		
		Product p3 = new Product();
		p3.setProductId(1003);
		p3.setProductName("Laptop");
		p3.setProductPrice(50000);
		
		System.out.println("Product ID = "+p1.getProductId()+" Product Name = "+p1.getProductName()+" Product Price = "+p1.getProductPrice());
		System.out.println("Product ID = "+p2.getProductId()+" Product Name = "+p2.getProductName()+" Product Price = "+p2.getProductPrice());
		System.out.println("Product ID = "+p3.getProductId()+" Product Name = "+p3.getProductName()+" Product Price = "+p3.getProductPrice());
	}

}
