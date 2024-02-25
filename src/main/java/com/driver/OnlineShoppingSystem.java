package com.driver;

import java.util.Scanner;

public class OnlineShoppingSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productId;
        String productName;
        double price;
        String brand;
        String size;
        String author;

        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nSelect the product category to add to the cart:");
            System.out.println("1. Electronics");
            System.out.println("2. Clothing");
            System.out.println("3. Book");
            System.out.println("4. Display Cart");
            System.out.println("5. Checkout and Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 5) {
                break;
            }

            System.out.print("Enter Product ID: ");
            productId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Product Name: ");
            productName = scanner.nextLine();
            System.out.print("Enter Price: ");
            price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Brand: ");
                    brand = scanner.nextLine();
                    cart.addProduct(new Electronics(productId, productName, price, brand));
                    break;
                case 2:
                    System.out.print("Enter Size: ");
                    size = scanner.nextLine();
                    cart.addProduct(new Clothing(productId, productName, price, size));
                    break;
                case 3:
                    System.out.print("Enter Author: ");
                    author = scanner.nextLine();
                    cart.addProduct(new Book(productId, productName, price, author));
                    break;
                case 4:
                    cart.displayCart();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        double totalCost = cart.getTotalCost();
        System.out.println("\nTotal Cost of the Cart: $" + totalCost);
        scanner.close();
    }
}
