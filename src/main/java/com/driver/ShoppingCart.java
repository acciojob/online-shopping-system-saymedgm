package com.driver;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Product product : cartItems) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    public void displayCart() {
        System.out.println("\nShopping Cart:");
        for (Product product : cartItems) {
            product.displayDetails();
            System.out.println("------------------------");
        }
    }

    // Getter method for direct access to cartItems
    public ArrayList<Product> getCartItems() {
        return cartItems;
    }
}