package ForEach;

public class Program {
    public static void main(String[] args) {
        String[] vect = new String[] {"Jeff", "Daniels", "Jeremiah"};

        //Declaracao do forEach em java:
        for(String name : vect) {
            System.out.println("Nome: " + name);
        }
    }
}