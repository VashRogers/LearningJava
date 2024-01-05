package constructorsExample.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){ //exemplo de sobrecarga, nao sendo necessario inicializar quantidade
        this.name = name;
        this.price = price;
    }

    public double TotalValueInStock() {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return
                "name: " + name +
                        " price: " + String.format("%.2f", price) +
                        " quantity: " + quantity +
                        ", total value in Stock: " + String.format("%.2f", TotalValueInStock());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
