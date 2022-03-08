package com.stringexample;
final class Product{
	final String prodName;

	public Product(String prodName) {
		
		this.prodName = prodName;
	}

	public String getProdName() {
		return prodName;
	}
	
}
public class CustomerImmutable {

	public static void main(String[] args) {
		Product prodinfo = new Product("Desktop");
		String prodName = prodinfo.getProdName();
		System.out.println(prodName);

	}

}
