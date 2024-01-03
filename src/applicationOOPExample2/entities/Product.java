package applicationOOPExample2.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock() {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public static String teste() {
        return "Testou";
    }

    public String toString(){
        return
                "name: " + name +
                " price: " + String.format("%.2f", price) +
                " quantity: " + quantity +
                ", total value in Stock: " + String.format("%.2f", TotalValueInStock());
    }
}
