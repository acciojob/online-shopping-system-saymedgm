package com.driver;

public class Electronics extends Product {
	private String brand;
	public Electronics(int productId, String productName, double price, String brand) {
		super(productId, productName, price);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void displayDetails() {
		System.out.println("Product ID: " + getProductId());
		System.out.println("Product Name: " + getProductName());
		System.out.println("Price: $" + getPrice());
		System.out.println("Brand: " + brand);
	}
}