package applicationOOPExample2;

import applicationOOPExample2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        System.out.println(Product.teste()); chamada de método estático
        Product product = new Product();
        System.out.println("Enter product data:");

        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(product);/*se tiver um toString na classe, o java ja fraga essa parada e n precisa chamar o
        método ao chamar a variavel no println*/

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed in stock: ");
        int quantityToRemove = sc.nextInt();
        product.RemoveProducts(quantityToRemove);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
