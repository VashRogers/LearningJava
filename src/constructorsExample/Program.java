package constructorsExample;

import constructorsExample.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data:");

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);
        System.out.println("Product: " + product);


        System.out.println("Enter the number of products to be added in stock: ");
        int quantityAdded = sc.nextInt();
        product.AddProducts(quantityAdded);
        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed in stock: ");
        int quantityToRemove = sc.nextInt();
        product.RemoveProducts(quantityToRemove);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
