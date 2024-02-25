package com.driver;

public class Book extends Product {
    private String author;

    public Book(int productId, String productName, double price, String author) {
        super(productId, productName, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Author: " + author);
    }
}