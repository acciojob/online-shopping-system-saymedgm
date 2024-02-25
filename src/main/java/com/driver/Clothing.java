package com.driver;

public class Clothing extends Product {
	private String size;

    public Clothing(int productId, String productName, double price, String size) {
        super(productId, productName, price);
        // your code goes here
    }

    public String getSize() {
    	// your code goes here
        return size;
    }

    public void displayDetails() {
        // your code goes here
    }
}
