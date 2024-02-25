package com.driver;

public class Clothing extends Product {
    private String size;

    public Clothing(int productId, String productName, double price, String size) {
        super(productId, productName, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Size: " + size);
    }
}