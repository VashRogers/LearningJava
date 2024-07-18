package VectorsExample.ProductsExample;

import VectorsExample.ProductsExample.Product.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductsExample {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qtd de produtos: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Nome do produto: ");
            String name = sc.nextLine();
            System.out.println("Preço do produto: ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);/* basicamente foi criado um array de objetos
            onde Product[] = [ 1:{name: "asdasd", price: 2.99 }, 2:{name: "edsad", price: 1.99 } ]; */
        }

        double sum = 0.0;
        for(int i = 0; i<n; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / n;
        System.out.println("Média dos preços dos produtos: " + avg);

    }

}
