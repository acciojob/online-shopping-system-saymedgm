package com.driver;

public class Book extends Product{
	private String author;

    public Book(int productId, String productName, double price, String author) {
        super(productId, productName, price);
        // your code goes here
    }

    public String getAuthor() {
    	// your code goes here
        return author;
    }

    public void displayDetails() {
        // your code goes here
    }
}
