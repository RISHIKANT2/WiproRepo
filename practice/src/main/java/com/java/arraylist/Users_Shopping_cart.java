package com.java.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Users_Shopping_cart {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();

        while (true) {

            System.out.println("\n===== SHOPPING CART MENU =====");
            System.out.println("1. Add an Item");
            System.out.println("2. Remove an Item");
            System.out.println("3. Show Cart Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

            case 1:
                System.out.print("Enter the Item to be added: ");
                String item = sc.nextLine();

                cart.add(item);

                System.out.println("Item added successfully.");
                break;

            case 2:

                if (cart.isEmpty()) {
                    System.out.println("Cart is empty. Nothing to remove.");
                } else {

                    System.out.println("Items in Cart:");
                    for (String s : cart) {
                        System.out.println("- " + s);
                    }

                    System.out.print("Enter item name to remove: ");
                    String rmItem = sc.nextLine();

                    if (cart.remove(rmItem)) {
                        System.out.println("Item removed successfully.");
                    } else {
                        System.out.println("Item not found in cart.");
                    }
                }
                break;

            case 3:

                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty.");
                } else {
                    System.out.println("Items in your cart:");

                    for (String s : cart) {
                        System.out.println("- " + s);
                    }
                }
                break;

            case 4:
                System.out.println("Thank you for shopping. Exiting...");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}