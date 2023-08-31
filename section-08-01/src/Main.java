import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Enter the product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextInt();
        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: "+ product);
        System.out.println("Enter the number of products to be added in stock:");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product + "\n");

        System.out.println("Enter the number of products to be removed in stock:");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);
        sc.close();

    }
}